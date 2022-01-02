import { createApp } from "vue";
import { createVuetify } from "vuetify";

import App from "./App.vue";
import { loadFonts } from "./plugins/webfontloader";
import router from "./router";

loadFonts();

const app = createApp(App);
const vuetify = createVuetify({});

app.use(vuetify);
app.use(router);

router.isReady().then(() => {
  app.mount("#app", true);
});
