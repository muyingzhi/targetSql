<template>
  <div id="app">
    <left-nav></left-nav>
    <div class="right" :style="{width: screenWidth + 'px'}">
      <router-view/>
    </div>
  </div>
</template>

<script>
import LeftNav from './components/left-nav.vue';

export default {
  name: 'App',
  components: {
    LeftNav
  },
  data: function () {
    return {
      screenWidth:1000
    };
  },
  mounted: function () {
    var that = this;
    this.screenWidth= document.body.clientWidth - 255;
    window.onresize = () => {
            return (() => {
              this.screenWidth = document.body.clientWidth - 255;
            })();
          };
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
.right {
  margin-left: 150px;
  height:100%;
  overflow: scroll;
}
</style>
