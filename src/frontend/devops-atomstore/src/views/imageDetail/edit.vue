<template>
    <article class="edit-atom-wrapper edit-detail" v-bkloading="{ isLoading }">
        <section class="inner-header">
            <div class="title"> {{ $t('store.镜像编辑') }} </div>
        </section>

        <main class="edit-main">
            <bk-form ref="editForm" class="edit-image" label-width="125" :model="form">
                <bk-form-item class="wt660" :label="$t('store.镜像名称')" :required="true" property="imageName" :rules="[requireRule]" ref="imageName">
                    <bk-input v-model="form.imageName" :placeholder="$t('store.请输入镜像名称')"></bk-input>
                </bk-form-item>
                <bk-form-item class="wt660" :label="$t('store.分类')" :required="true" property="classifyCode" :rules="[requireRule]" ref="classifyCode">
                    <bk-select v-model="form.classifyCode" searchable>
                        <bk-option v-for="(option, index) in classifys"
                            :key="index"
                            :id="option.classifyCode"
                            :name="option.classifyName"
                            :placeholder="$t('store.请选择分类')"
                            @click.native="chooseImageName(option)"
                        >
                        </bk-option>
                    </bk-select>
                </bk-form-item>
                <bk-form-item class="wt660" :label="$t('store.标签')" property="labelIdList">
                    <bk-select v-model="form.labelIdList" searchable multiple show-select-all @selected="chooseLabel">
                        <bk-option v-for="(option, index) in labelList"
                            :key="index"
                            :id="option.id"
                            :name="option.labelName"
                            :placeholder="$t('store.请选择功能标签')"
                        >
                        </bk-option>
                    </bk-select>
                </bk-form-item>
                <bk-form-item :label="$t('store.范畴')" property="category" :required="true" :rules="[requireRule]" ref="category">
                    <bk-select v-model="form.category" searchable>
                        <bk-option v-for="(option, index) in categoryList"
                            :key="index"
                            :id="option.categoryCode"
                            :name="option.categoryName"
                            :placeholder="$t('store.请选择范畴')"
                        >
                        </bk-option>
                    </bk-select>
                </bk-form-item>
                <bk-form-item :label="$t('store.简介')" property="summary" :required="true" :rules="[requireRule]" ref="summary">
                    <bk-input v-model="form.summary" :placeholder="$t('store.请输入简介')"></bk-input>
                </bk-form-item>
                <bk-form-item :label="$t('store.描述')" property="description">
                    <mavon-editor class="image-remark-input"
                        ref="mdHook"
                        v-model="form.description"
                        :toolbars="toolbars"
                        :external-link="false"
                        :box-shadow="false"
                        preview-background="#fff"
                        @imgAdd="uploadimg"
                    />
                </bk-form-item>
                <bk-form-item label="Dockerfile" :required="true" property="dockerFileContent" :rules="[requireRule]" ref="dockerFileContent">
                    <section class="dockerfile" @click="freshCodeMirror"></section>
                </bk-form-item>
                <div class="version-msg">
                    <p class="form-title"> {{ $t('store.版本信息') }} </p>
                    <hr class="cut-line">
                </div>
                <bk-form-item :label="$t('store.发布者')" :required="true" property="publisher" :rules="[requireRule]" ref="publisher">
                    <bk-input v-model="form.publisher" :placeholder="$t('store.请输入发布者')"></bk-input>
                </bk-form-item>
                <bk-form-item>
                    <bk-button theme="primary" @click.native="saveImage"> {{ $t('store.保存') }} </bk-button>
                </bk-form-item>
                <select-logo ref="selectLogo" label="Logo" :form="form" type="IMAGE" :is-err="logoErr" right="25"></select-logo>
            </bk-form>
        </main>
    </article>
</template>

<script>
    import { mapActions } from 'vuex'
    import { toolbars } from '@/utils/editor-options'
    import selectLogo from '@/components/common/selectLogo'

    import CodeMirror from 'codemirror'
    import 'codemirror/mode/yaml/yaml'
    import 'codemirror/lib/codemirror.css'
    import 'codemirror/theme/3024-night.css'

    export default {
        components: {
            selectLogo
        },

        data () {
            return {
                isLoading: false,
                form: JSON.parse(JSON.stringify(this.$store.state.store.currentImage)),
                requireRule: {
                    required: true,
                    message: this.$t('store.必填项'),
                    trigger: 'blur'
                },
                classifys: [],
                labelList: [],
                categoryList: [],
                codeMirrorCon: {
                    lineNumbers: true,
                    height: '400px',
                    tabMode: 'indent',
                    mode: 'yaml',
                    theme: '3024-night',
                    cursorHeight: 0.85,
                    autoRefresh: true,
                    autofocus: true
                },
                codeEditor: {},
                toolbars
            }
        },

        created () {
            this.hackData()
            this.initData()
        },

        methods: {
            ...mapActions('store', [
                'requestImageClassifys',
                'requestImageLabel',
                'requestImageCategorys',
                'requestUpdateImageInfo'
            ]),

            freshCodeMirror () {
                this.codeEditor.refresh()
                this.codeEditor.focus()
            },

            chooseImageName (option) {
                this.form.classifyName = option.classifyName
                this.form.classifyId = option.id
            },

            chooseLabel (ids) {
                this.form.labelList = this.labelList.filter((x) => ids.includes(x.id)) || []
            },

            hackData () {
                this.form.labelIdList = this.form.labelList.map(label => label.id)
                this.form.description = this.form.description || this.$t('store.imageMdDesc')
            },

            initData () {
                this.isLoading = true
                Promise.all([
                    this.requestImageClassifys(),
                    this.requestImageLabel(),
                    this.requestImageCategorys()
                ]).then(([classifys, labels, categorys]) => {
                    this.classifys = classifys
                    this.labelList = labels
                    this.categoryList = categorys
                }).catch((err) => this.$bkMessage({ message: err.message || err, theme: 'error' })).finally(() => {
                    this.isLoading = false
                    const ele = document.querySelector('.dockerfile')
                    this.codeEditor = CodeMirror(ele, this.codeMirrorCon)
                    this.codeEditor.setValue(this.form.dockerFileContent || '')
                    this.codeEditor.refresh()
                })
            },

            saveImage () {
                this.$refs.editForm.validate().then(() => {
                    if (!this.form.logoUrl) {
                        this.logoErr = true
                        const err = { field: 'selectLogo' }
                        throw err
                    }
                    this.isLoading = true
                    this.form.dockerFileContent = this.codeEditor.getValue()
                    const postData = {
                        imageCode: this.form.imageCode,
                        data: this.form
                    }
                    this.requestUpdateImageInfo(postData).then(() => {
                        this.$store.dispatch('store/updateCurrentImage', this.form)
                        this.$bkMessage({ message: this.$t('store.修改成功'), theme: 'success' })
                        this.$router.push({ name: 'imageDetail' })
                    }).catch((err) => this.$bkMessage({ message: err.message || err, theme: 'error' })).finally(() => {
                        this.isLoading = false
                    })
                }).catch((validate) => {
                    const field = validate.field
                    const label = this.$refs[field].label
                    this.$bkMessage({ message: `${label + this.$t('store.是必填项，请填写以后重试')}`, theme: 'error' })
                })
            },

            async uploadimg (pos, file) {
                const formData = new FormData()
                const config = {
                    headers: {
                        'Content-Type': 'multipart/form-data'
                    }
                }
                let message, theme
                formData.append('file', file)

                try {
                    const res = await this.$store.dispatch('store/uploadFile', {
                        formData,
                        config
                    })

                    this.$refs.mdHook.$img2Url(pos, res)
                } catch (err) {
                    message = err.message ? err.message : err
                    theme = 'error'

                    this.$bkMessage({
                        message,
                        theme
                    })
                    this.$refs.mdHook.$refs.toolbar_left.$imgDel(pos)
                }
            }
        }
    }
</script>

<style lang="scss" scoped>
    @import './../../assets/scss/conf';
    .dockerfile {
        height: 400px;
        overflow: auto;
        background: black;
        /deep/ .CodeMirror {
            font-family: Consolas, "Courier New", monospace;
            line-height: 1.5;
            padding: 10px;
            height: auto;
        }
    }

    .edit-atom-wrapper {
        height: 100%;
        overflow: auto;
        .inner-header {
            display: flex;
            justify-content: space-between;
            padding: 18px 20px;
            width: 100%;
            height: 60px;
            border-bottom: 1px solid $borderWeightColor;
            background-color: #fff;
            box-shadow:0px 2px 5px 0px rgba(51,60,72,0.03);
            .title {
                font-size: 16px;
            }
        }
    }

    .h32 {
        height: 32px;
    }

    .mt6 {
        margin-top: 6px;
    }

    .mr12 {
        margin-right: 12px;
    }

    .lh30 {
        line-height: 30px;
    }

    .wt660 {
        width: 660px;
    }

    .version-msg {
        margin: 30px 0 20px;
    }

    .edit-main {
        height: calc(100% - 60px);
        overflow: auto;
    }

    .edit-image {
        position: relative;
        width: 1200px;
        margin: 18px 20px;
        .image-remark-input {
            height: 263px;
            border: 1px solid #c4c6cc;
            &.fullscreen {
                height: auto;
            }
        }
    }
</style>
