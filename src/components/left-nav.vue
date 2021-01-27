<template>
  <div class="nav2">
    <ul class="accordion">
      <li :class="tabon==i ? 'act':''" v-for="(data,i) in datas" :key="i" @click="tabclick(i)">
        <router-link :to="'/page1/'+data.title+'/'+data.targetid">
          <span class="icon-shouye"></span>
          {{data.title}}
        </router-link>
      </li>
    </ul>
  </div>
</template>
<script>
  export default {
    name: 'left-nav',
    data: function() {
      return {
        tabon:false,
        datas:[
          {title:"首页",targetid:"00",img:'home.png',imgon:'home-curr.png'},
          {title:"门诊人次",targetid:"ITargetDetail0101",img:'home.png',imgon:'home-curr.png'},
          {title:"健康体检人次",targetid:"ITargetDetail0102",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"急诊人次",targetid:"ITargetDetail0103",img:'home.png',imgon:'home-curr.png'},
          {title:"留观人次",targetid:"ITargetDetail0104",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"住院患者入院例数",targetid:"ITargetDetail0105",img:'home.png',imgon:'home-curr.png'},
          {title:"住院患者出院例数",targetid:"ITargetDetail0106",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"住院患者实际占用总床日",targetid:"ITargetDetail0107",img:'home.png',imgon:'home-curr.png'},
          {title:"住院手术例数",targetid:"ITargetDetail0108",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"门诊手术例数",targetid:"ITargetDetail0109",img:'home.png',imgon:'home-curr.png'},
          {title:"实际开放床位数",targetid:"ITargetDetail0201",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"重症医学科实际开放床位",targetid:"ITargetDetail0202",img:'home.png',imgon:'home-curr.png'},
          {title:"全院员工总数",targetid:"ITargetDetail0204",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"医师数",targetid:"ITargetDetail0205",img:'home.png',imgon:'home-curr.png'},
          {title:"护理人员数",targetid:"ITargetDetail0206",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"医技人数",targetid:"ITargetDetail0207",img:'home.png',imgon:'home-curr.png'},
          {title:"住院患者死亡率",targetid:"ITargetDetail0303",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"住院危重抢救例数",targetid:"ITargetDetail0306",img:'home.png',imgon:'home-curr.png'},
          {title:"住院危重死亡例数",targetid:"ITargetDetail0307",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"新生儿患者住院死亡数",targetid:"ITargetDetail0310",img:'home.png',imgon:'home-curr.png'},
          {title:"住院患者自动出院例数",targetid:"ITargetDetail0311",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"住院患者死亡例数",targetid:"ITargetDetail0312",img:'home.png',imgon:'home-curr.png'},
          {title:"出院患者平均住院日",targetid:"ITargetDetail0401",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"平均每张床位工作日",targetid:"ITargetDetail0402",img:'home.png',imgon:'home-curr.png'},
          {title:"床位使用率",targetid:"ITargetDetail0403",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"床位周转次数",targetid:"ITargetDetail0404",img:'home.png',imgon:'home-curr.png'},
          {title:"人均收入",targetid:"ITargetDetail0405",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"床均收入",targetid:"ITargetDetail0406",img:'home.png',imgon:'home-curr.png'},
          {title:"每门诊人次费用",targetid:"ITargetDetail0501",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"每门诊人次费用(药费)",targetid:"ITargetDetail0502",img:'home.png',imgon:'home-curr.png'},
          {title:"每住院人次费用",targetid:"ITargetDetail0503",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"每住院人次费用(药费)",targetid:"ITargetDetail0504",img:'home.png',imgon:'home-curr.png'},
          {title:"流动比率",targetid:"ITargetDetail0601",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"速动比率",targetid:"ITargetDetail0602",img:'home.png',imgon:'home-curr.png'},
          {title:"医疗收入/百元固定资产",targetid:"ITargetDetail0603",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"业务支出/百元业务收入",targetid:"ITargetDetail0604",img:'home.png',imgon:'home-curr.png'},
          {title:"资产负债率",targetid:"ITargetDetail0605",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"固定资产总值(万元)",targetid:"ITargetDetail0606",img:'home.png',imgon:'home-curr.png'},
          {title:"医疗收入中药品收入比率",targetid:"ITargetDetail0607",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"医用材料收入比率",targetid:"ITargetDetail0608",img:'home.png',imgon:'home-curr.png'},
          {title:"门诊收入(万元)",targetid:"ITargetDetail0609",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"住院收入(万元)",targetid:"ITargetDetail0610",img:'home.png',imgon:'home-curr.png'},
          {title:"成本支出（万元）",targetid:"ITargetDetail0611",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"住院应收(万元)",targetid:"ITargetDetail0612",img:'home.png',imgon:'home-curr.png'},
          {title:"抗菌药物处方数/每百张门诊处方(%)",targetid:"ITargetDetail0801",img:'home.png',imgon:'home-curr.png'},
          {title:"注射剂处方数/每百张门诊处方(%)",targetid:"ITargetDetail0802",img:'ylfw.png',imgon:'ylfw-curr.png'},
          {title:"抗菌药物占西药出库总金额比重(%)",targetid:"ITargetDetail0804",img:'home.png',imgon:'home-curr.png'},
       
        ]
      }
    },
    mounted: function() {

    },  
    methods: {
      tabclick:function(index){
        this.tabon=index;
      }
    },
    watch: {

    }
  }
</script>
<style scoped>
ul{padding-left: 10px;}
 .accordion{border:none;background-color:initial;}
 .nav2{width:150px;position:absolute;left:0;top:0;height:100%;overflow: scroll;padding:0;background-color:#011c2f}
 .nav2 .menu_nav{border-radius:4px;background:#2e9bed;margin:5px 0;color:#fff;text-align:center;font-size:14px;line-height:36px;text-align:center}
 .nav2 .accordion{text-align:center;position:relative;z-index:6}
 .nav2 .accordion li{height:25px; font-size:14px; display:block; width:100%; color:#fff; cursor:pointer; word-wrap:break-word; text-align:center; padding-top:12%;}
 .nav2 .accordion li a{color:#fff}
 .nav2 .accordion .act, .nav2 .accordion li:hover{background:url(../assets/nav_highlight.png) #000 center bottom no-repeat;}
 .nav2 .accordion .act a{ color: #3481cf;}
 .nav2 .accordion .act a>span{color: #3481cf;}
 .nav2 .accordion li>a>span{display: block; height: 30px; margin-bottom: 5%;}

 @media screen and (max-width: 1800px) {
     .nav2 .accordion li{font-size: 12px;}
 }
</style>
