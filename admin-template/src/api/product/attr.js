import request from '@/utils/request'



export const reqCateList =()=>request({url:'http://localhost:9528/cat',method:'get'})

export const reqDelete = (id)=>request({url:`http://localhost:9528/cat/${id}`,method:'delete'})

export const reqAdd =(data)=>request({url:'http://localhost:9528/cat',method:'post',data})

export const reqUpdata =(data)=>request({url:'http://localhost:9528/catswd',method:'put',data})