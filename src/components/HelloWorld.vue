<template>
  <div>
    <h1>{{title}}-{{targetid}}</h1>
    <div style="margin-left:10px;height:100%;overflow:scroll;">
      <xmp style="text-align:left">
      </xmp>
    </div>
  </div>
</template>

<script>
var $ = require("jquery");

export default {
  name: 'HelloWorld',
  props: ["title","targetid"],
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  mounted: function(){
    $("xmp").load("/static/"+this.targetid+".mapper.xml");
  },
  watch:{
    targetid: {
          handler: function (newData) {
              $("xmp").load("./static/"+newData+".mapper.xml");
          }
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
