import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home,
    meta: {
      title: '首页',
    },
  },
  {
    path: '/chat',
    name: 'chat',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/chat'),
    meta: {
      title: 'chat',
    },
  },
  // 用户画像
  {
    path: '/portrait',
    name: 'portrait',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/portrait/index'),
    meta: {
      title: 'portrait',
    },
  },
  //  用户画像详情
  {
    path: '/detail',
    name: 'detail',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/portrait/detail.vue'),
    hidden: true,
    meta: {
      title: '',
    },
  },
  // 社群关系
  {
    path: '/community',
    name: 'community',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/portrait/community.vue'),
    hidden: true,
    meta: {
      title: '',
    },
  },
]

const router = new VueRouter({
  routes,
})

export default router
