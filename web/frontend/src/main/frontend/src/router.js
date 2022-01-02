import { createRouter, createWebHistory } from "vue-router";
import LandingPage from "@/components/LandingPage.vue";

const router = createRouter({
  routes: [
    {
      path: "/",
      component: LandingPage,
    },
  ],
  history: createWebHistory(),
});

export default router;
