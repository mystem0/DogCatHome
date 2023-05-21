<template>
  <div>
      <el-button type="primary" icon="el-icon-search" @click="check">查询猫类</el-button>
      <el-button type="primary" icon="el-icon-search" @click="checkDog">查询狗类</el-button>
      <el-button type="primary" icon="el-icon-search" @click="checkAll">查询全部</el-button>
    <el-button type="primary" icon="el-icon-plus" style="margin: 10px 10px" @click="showDialog"></el-button>
    <el-table style="width: 100%" border :data="list">
      <el-table-column label="序号" type="index" align="center" width="80px"></el-table-column>
      <el-table-column label="品种名称" prop="name"></el-table-column>
      <el-table-column label="品种性别" prop="sex"></el-table-column>

      <el-table-column label="品种" prop="variety"></el-table-column>
      <el-table-column label="照片" prop="img"></el-table-column>

      <el-table-column label="操作">
        <template slot-scope="{row}">
          <el-button type="primary" size="small" @click="updataSlot(row)">编辑</el-button>

          <el-button type="danger" size="small" @click="deleteSlot(row)">删除</el-button>



        </template>
      </el-table-column>
    </el-table>

    <!-- 对话框 -->
    <!-- :before-close="handleClose" -->

    <el-dialog title="提示" :visible.sync="dialogVisible" width="30%">
      <!-- :model="" -->
      <!-- :rules="rules"  -->
      <!-- 展示表单元素 form :model属性，这个属性的作用，把表单的数据收集到那个对象的身上，将来需要表单验证，也需要这个属性 -->
      <!-- :rules="rules" -->
      <el-form style="width: 80%" ref="ruleForm" :model="tmForm">
        <el-form-item label="品牌名称" label-width="100px" >
          <el-input autocomplete="off" v-model="tmForm.name"></el-input>
        </el-form-item>
        <!-- <el-form-item label="品牌LOGO" label-width="100px" prop="logoUrl"> -->
        <!-- action:上传图片的地址 -->
        <!-- :on-success:可以检测到图片上传成功，当图片上传成功，会执行一次 -->
        <!-- :before-upload:可以在上传图片之前，执行一次 -->
        <!-- <el-upload class="avatar-uploader" action="/dev-api/admin/product/fileUpload" :show-file-list="false"
            :on-success="handleAvatarSuccess" :before-upload="beforeAvatarUpload"> -->
        <!-- <img v-if="tmForm.logoUrl" :src="tmForm.logoUrl" class="avatar" /> -->
        <!-- v-else -->
        <!-- <i class="el-icon-plus avatar-uploader-icon"></i>
            <div slot="tip" class="el-upload__tip">
              只能上传jpg/png文件，且不超过500kb
            </div> -->
        <!-- </el-upload> -->
        <!-- </el-form-item> -->
        <el-form-item label="品种性别" label-width="100px" >
          <el-input autocomplete="off" v-model="tmForm.sex"></el-input>
        </el-form-item>
        <el-form-item label="品种" label-width="100px" >
          <el-input autocomplete="off" v-model="tmForm.variety"></el-input>
        </el-form-item>
        <el-form-item label="描述" label-width="100px" >
          <el-input autocomplete="off" v-model="tmForm.description"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="addOr">确 定</el-button>
      </div>
    </el-dialog>

    <el-pagination style="margin-top: 20px; text-align: center;" @size-change="handleSizeChange"
      @current-change="handleCurrentChange" :current-page="1" :page-sizes="[3, 5, 7, 10]" :page-size="3"
      layout="total, sizes, prev, pager, next, jumper" :total="400">
    </el-pagination>
  </div>
</template>

<script>
import axios from 'axios';
export default {
  name: "tradeMark",
  data() {
    return {
      //   // 表单验证规则
      //   rules: {
      //   // 品牌名称验证规则
      //   // required:必须要检验的字段(前面五角星)  message:提示信息  trigger:用户行为设置(事件设置:blur,change)
      //   tmName: [
      //     { required: true, message: "请输入品牌名称", trigger: "blur" },
      //     // 品牌名称长度2-10
      //     {
      //       min: 2,
      //       max: 10,
      //       message: "长度在 2 到 10 个字符",
      //       trigger: "blur",
      //     },
      //   ],
      //   // 品牌logo验证规则
      //   logoUrl: [{ required: true, message: "请选择品牌LOGO" }],
      // },
      list: [],
      // 控制对话框显示与隐藏的按钮
      dialogVisible: false,
      tmForm: {
        name: '',
        sex: '',
        variety: '',
        description:''

      },
      
    }

  },
  methods: {
    handleSizeChange() { },
    handleCurrentChange() { },

    showDialog() {
      this.dialogVisible = true;

    },
    check(){
      axios({url:'http://localhost:9528/cat',method:'get'}).then((res)=>{
        console.log(res,'猫');
        this.list = res.data
      })
    },
    checkDog(){
      axios({url:'http://localhost:9528/dog',method:'get'}).then((res)=>{
        console.log(res);
        this.list = res.data
      })
    },
    checkAll(){
      this.getList()
    },

    // 图片上传之前
    // beforeAvatarUpload(file) {
    //   const isJPG = file.type === "image/jpeg";
    //   const isLt2M = file.size / 1024 / 1024 < 2;

    //   if (!isJPG) {
    //     this.$message.error("上传头像图片只能是 JPG 格式!");
    //   }
    //   if (!isLt2M) {
    //     this.$message.error("上传头像图片大小不能超过 2MB!");
    //   }
    //   return isJPG && isLt2M;
    // },
    // 图片上传成功
    // handleAvatarSuccess(res, file) {
    //   console.log(res, '上传图片');
    //   // res： 上传成功之后上传真实的地址
    //   // file: 服务器返回给前端的数据
    //   // 收集品牌图片的数据，将来带给服务器
    //   this.tmForm.logoUrl = res.data;
    // },
    updataSlot(row){
      console.log(row);
      this.dialogVisible = true
      this.tmForm = {...row}
    },
    async addOr(){
      let result = await this.$API.attr.reqUpdata(this.tmForm)
      console.log(result)
      // axios({url:'http://localhost:9528/cat',method:'put',data:this.tmForm}).then((res)=>{
      //   console.log(res);
      // })
    },

    async deleteSlot(row) {
      // console.log(row);
      axios({ url: `http://localhost:9528/cat/${row.id}`, method: 'delete' }).then((res) => {
        if (res.status === 200) {
          this.getList()
          this.$message({
            message: '删除成功',
            type: 'success'
          });
        }
      })


      // console.log(result,'result');
      // reqDelete()
    },
    getList() {
      axios.get('http://localhost:9528/login/all').then((res) => {
        console.log(res, 'res');
        this.list = res.data
      })
    }
  },
  mounted() {
    this.getList()
  }
};
</script>

<style>
.avatar-uploader .el-upload {
  border: 1px dashed #d9d9d9;
  border-radius: 6px;
  cursor: pointer;
  position: relative;
  overflow: hidden;
}

.avatar-uploader .el-upload:hover {
  border-color: #409EFF;
}

.avatar-uploader-icon {
  font-size: 28px;
  color: #8c939d;
  width: 178px;
  height: 178px;
  line-height: 178px;
  text-align: center;
}

.avatar {
  width: 178px;
  height: 178px;
  display: block;
}
</style>
