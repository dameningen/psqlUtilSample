<template>
  <v-app>
    <v-main>
      <HelloWorld/>
      <vtable-test></vtable-test>
    </v-main>
  </v-app>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import VtableTest from './components/VtableTest.vue'

export default {
  name: 'App',

  components: {
    HelloWorld,
    VtableTest,
  },

  data: () => ({
    //
  }),
}
</script>
