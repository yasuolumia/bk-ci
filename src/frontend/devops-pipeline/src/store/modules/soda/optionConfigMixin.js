/*
 * Tencent is pleased to support the open source community by making BK-CI 蓝鲸持续集成平台 available.
 *
 * Copyright (C) 2019 THL A29 Limited, a Tencent company.  All rights reserved.
 *
 * BK-CI 蓝鲸持续集成平台 is licensed under the MIT license.
 *
 * A copy of the MIT License is included in this file.
 *
 *
 * Terms of the MIT License:
 * ---------------------------------------------------
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

// 根据配置文件获取原子流程控制选项的默认值
const optionConfigMixin = {
    data () {
        return {
            ATOM_OPTION: {
                enable: {
                    rule: {},
                    type: 'boolean',
                    component: 'atom-checkbox',
                    text: this.$t('storeMap.enableAtom'),
                    default: true
                },
                continueWhenFailed: {
                    rule: {},
                    type: 'boolean',
                    component: 'atom-checkbox',
                    text: this.$t('storeMap.continueWhenFailed'),
                    default: false
                },
                timeout: {
                    rule: { 'numeric': true, 'max_value': 10080 },
                    component: 'vuex-input',
                    label: this.$t('storeMap.atomTimeout'),
                    desc: this.$t('storeMap.timeoutDesc'),
                    placeholder: this.$t('storeMap.timeoutPlaceholder'),
                    default: '900'
                },
                runCondition: {
                    rule: {},
                    component: 'selector',
                    label: this.$t('storeMap.atomRunCondition'),
                    default: 'PRE_TASK_SUCCESS',
                    list: [
                        {
                            id: 'PRE_TASK_SUCCESS',
                            name: this.$t('storeMap.atomPreSuc')
                        },
                        {
                            id: 'PRE_TASK_FAILED_BUT_CANCEL',
                            name: this.$t('storeMap.atomEvenFail')
                        },
                        {
                            id: 'PRE_TASK_FAILED_ONLY',
                            name: this.$t('storeMap.atomOnlyFail')
                        },
                        {
                            id: 'CUSTOM_VARIABLE_MATCH',
                            name: this.$t('storeMap.varMatch')
                        },
                        {
                            id: 'CUSTOM_VARIABLE_MATCH_NOT_RUN',
                            name: this.$t('storeMap.varNotMatch')
                        }
                    ]
                },
                customVariables: {
                    rule: {},
                    component: 'key-value-normal',
                    default: [{ key: 'param1', value: '' }],
                    allowNull: false,
                    label: this.$t('storeMap.customVar'),
                    isHidden: (element) => {
                        return !(element.additionalOptions && (element.additionalOptions.runCondition === 'CUSTOM_VARIABLE_MATCH' || element.additionalOptions.runCondition === 'CUSTOM_VARIABLE_MATCH_NOT_RUN'))
                    }
                },
                otherTask: {
                    isHidden: true,
                    default: ''
                },
                customCondition: {
                    isHidden: true,
                    default: ''
                }
            }
        }
    },
    methods: {
        getAtomOptionDefault () {
            return Object.keys(this.ATOM_OPTION).reduce((formProps, key) => {
                if (this.ATOM_OPTION[key] && typeof this.ATOM_OPTION[key].default === 'object') {
                    formProps[key] = JSON.parse(JSON.stringify(this.ATOM_OPTION[key].default))
                } else {
                    formProps[key] = this.ATOM_OPTION[key].default
                }
                return formProps
            }, {})
        }
    }
}

export default optionConfigMixin
