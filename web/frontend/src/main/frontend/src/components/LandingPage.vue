<template>
  <v-container>
    <v-card>
      <h1 class="display-2 font-weight-bold mb-3">
        <div>Welcome to The Unixcounter Project!</div>
      </h1>
      <v-img :src="logo" class="my-3" contain height="200" />
    </v-card>

    <v-divider></v-divider>

    <v-card>
      <p class="subheading font-weight-regular">
        This will be the new page for the Unixcounter Project (revived
        Linuxcounter Project)!
      </p>
    </v-card>

    <v-divider></v-divider>

    <v-card>
      <h2 class="headline font-weight-bold mb-5">What's next?</h2>
      <p>
        Please refer to:&nbsp;
        <a
          class="subheading mx-3"
          target="_blank"
          href="https://github.com/LinuxCounter/unixcounter"
        >
          https://github.com/LinuxCounter/unixcounter
        </a>
        .
      </p>
    </v-card>
  </v-container>
</template>

<script>
import logo from "../assets/logo.png";

export default {
  name: "LandingPage",

  data: () => ({
    logo,
  }),
};
</script>
