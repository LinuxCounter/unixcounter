<template>
  <v-app>
    <AppHeader />

    <v-main>
      <v-container fluid>
        <!-- If using vue-router -->
        <router-view v-slot="{ Component }">
          <component :is="Component"></component>
        </router-view>
      </v-container>
    </v-main>
  </v-app>

  <v-footer app>
    <!-- -->
    <v-btn hide-details inset icon label="Theme Dark" @click="toggleTheme">
      <v-icon>mdi-invert-colors</v-icon>
    </v-btn>
  </v-footer>
</template>

<script>
import AppHeader from "@/components/AppHeader.vue";

export default {
  name: "App",
  data: () => ({}),
  components: {
    AppHeader,
  },
  methods: {
    toggleTheme() {
      this.$vuetify.theme.dark = !this.$vuetify.theme.dark;
    },
  },
};
</script>

<style>
@import "../node_modules/typeface-roboto/index.css";
</style>
