<template>
  <div id="headerBar">
    <v-app-bar shrink-on-scroll density="compact" absolute>
      <v-app-bar-nav-icon></v-app-bar-nav-icon>

      <router-link to="/" class="logolink">
        <v-img contain height="32" width="32" class="mr-2" :src="logo" />&nbsp;
        <v-app-bar-title shrink-on-scroll>The Unix Counter</v-app-bar-title>
      </router-link>

      <v-spacer></v-spacer>

      <v-btn text>Developer</v-btn>

      <v-btn class="mr-3" text>Help</v-btn>
    </v-app-bar>

    <!-- <AppNavigation ref="navigation" /> -->
  </div>
</template>

<script>
// import { AppNavigation } from "@/components/AppNavigation.vue";
import logo from "../assets/logo.png";

export default {
  name: "AppHeader",
  components: [],

  data: () => ({
    logo,
  }),
};
</script>

<style scoped>
.logolink,
.logolink:active,
.logolink:hover {
  color: inherit;
  text-decoration: none;
  display: flex;
  align-items: center;
}
</style>
