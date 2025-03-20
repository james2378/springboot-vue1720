import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import shenqingxiugai from '@/views/modules/shenqingxiugai/list'
    import guidangshenhe from '@/views/modules/guidangshenhe/list'
    import guihaidangan from '@/views/modules/guihaidangan/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import xueshengdangan from '@/views/modules/xueshengdangan/list'
    import guidangjianmu from '@/views/modules/guidangjianmu/list'
    import danganruku from '@/views/modules/danganruku/list'
    import shenqingjieyue from '@/views/modules/shenqingjieyue/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/shenqingxiugai',
        name: '申请修改',
        component: shenqingxiugai
      }
      ,{
	path: '/guidangshenhe',
        name: '归档审核',
        component: guidangshenhe
      }
      ,{
	path: '/guihaidangan',
        name: '归还档案',
        component: guihaidangan
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/xueshengdangan',
        name: '学生档案',
        component: xueshengdangan
      }
      ,{
	path: '/guidangjianmu',
        name: '归档建目',
        component: guidangjianmu
      }
      ,{
	path: '/danganruku',
        name: '档案入库',
        component: danganruku
      }
      ,{
	path: '/shenqingjieyue',
        name: '申请借阅',
        component: shenqingjieyue
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
