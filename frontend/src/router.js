
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import WindowWindowManager from "./components/listers/WindowWindowCards"
import WindowWindowDetail from "./components/listers/WindowWindowDetail"

import WorkWorkManager from "./components/listers/WorkWorkCards"
import WorkWorkDetail from "./components/listers/WorkWorkDetail"

import PhonePhoneManager from "./components/listers/PhonePhoneCards"
import PhonePhoneDetail from "./components/listers/PhonePhoneDetail"

import MyPageView from "./components/MyPageView"
import MyPageViewDetail from "./components/MyPageViewDetail"
import CancellogCancelLogManager from "./components/listers/CancellogCancelLogCards"
import CancellogCancelLogDetail from "./components/listers/CancellogCancelLogDetail"

import EmailEmailManager from "./components/listers/EmailEmailCards"
import EmailEmailDetail from "./components/listers/EmailEmailDetail"


import UserLageView from "./components/UserLageView"
import UserLageViewDetail from "./components/UserLageViewDetail"
import MyPageView from "./components/MyPageView"
import MyPageViewDetail from "./components/MyPageViewDetail"
import MyPageView from "./components/MyPageView"
import MyPageViewDetail from "./components/MyPageViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/windows/windows',
                name: 'WindowWindowManager',
                component: WindowWindowManager
            },
            {
                path: '/windows/windows/:id',
                name: 'WindowWindowDetail',
                component: WindowWindowDetail
            },

            {
                path: '/works/works',
                name: 'WorkWorkManager',
                component: WorkWorkManager
            },
            {
                path: '/works/works/:id',
                name: 'WorkWorkDetail',
                component: WorkWorkDetail
            },

            {
                path: '/phones/phones',
                name: 'PhonePhoneManager',
                component: PhonePhoneManager
            },
            {
                path: '/phones/phones/:id',
                name: 'PhonePhoneDetail',
                component: PhonePhoneDetail
            },

            {
                path: '/phones/myPages',
                name: 'MyPageView',
                component: MyPageView
            },
            {
                path: '/phones/myPages/:id',
                name: 'MyPageViewDetail',
                component: MyPageViewDetail
            },
            {
                path: '/cancellogs/cancelLogs',
                name: 'CancellogCancelLogManager',
                component: CancellogCancelLogManager
            },
            {
                path: '/cancellogs/cancelLogs/:id',
                name: 'CancellogCancelLogDetail',
                component: CancellogCancelLogDetail
            },

            {
                path: '/emails/emails',
                name: 'EmailEmailManager',
                component: EmailEmailManager
            },
            {
                path: '/emails/emails/:id',
                name: 'EmailEmailDetail',
                component: EmailEmailDetail
            },


            {
                path: '/customers/userLages',
                name: 'UserLageView',
                component: UserLageView
            },
            {
                path: '/customers/userLages/:id',
                name: 'UserLageViewDetail',
                component: UserLageViewDetail
            },
            {
                path: '/customers/myPages',
                name: 'MyPageView',
                component: MyPageView
            },
            {
                path: '/customers/myPages/:id',
                name: 'MyPageViewDetail',
                component: MyPageViewDetail
            },
            {
                path: '/customers/myPages',
                name: 'MyPageView',
                component: MyPageView
            },
            {
                path: '/customers/myPages/:id',
                name: 'MyPageViewDetail',
                component: MyPageViewDetail
            },


    ]
})
