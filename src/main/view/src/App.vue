<template>
  <v-app>
    <v-app-bar app clipped-left>
      <v-toolbar-title>管理画面</v-toolbar-title>
    </v-app-bar>
    <Menu />
    <v-main>
      <Contents />
    </v-main>
  </v-app>
</template>

<script th:inline="javascript">
import Menu from './components/Menu';
import Contents from './components/Contents';

export default {
  name: 'App',

  components: {
    Menu,
    Contents,
  },

  data: () => ({
  }),
};
</script>
