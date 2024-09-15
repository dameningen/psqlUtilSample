<template>
  <v-app>
    <v-main>
      <HelloWorld />
      <vtable-test></vtable-test>
      <comment-data-list></comment-data-list>
    </v-main>
  </v-app>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
//import VtableTest from './components/VtableTest.vue'
import CommentDataList from './components/CommentDataList.vue'

export default {
  name: 'App',

  components: {
    HelloWorld,
    //VtableTest,
    CommentDataList,
  },

  data: () => ({
    //
  }),
}
</script>
