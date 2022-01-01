<template>
  <v-container>
    <v-row class="text-center">
      <v-col cols="12">
        <v-img :src="logo" class="my-3" contain height="200" />
      </v-col>

      <v-col class="mb-4">
        <h1 class="display-2 font-weight-bold mb-3">
          <div>Welcome to The Unixcounter Project!</div>
        </h1>

        <p class="subheading font-weight-regular">
          This will be the new page for the Unixcounter Project (revived
          Linuxcounter Project)!
        </p>
      </v-col>

      <v-col class="mb-5" cols="12">
        <h2 class="headline font-weight-bold mb-5">What's next?</h2>

        <v-row justify="center">
          Please refer to:&nbsp;
          <a
            class="subheading mx-3"
            target="_blank"
            href="https://github.com/LinuxCounter/unixcounter"
          >
            https://github.com/LinuxCounter/unixcounter
          </a>
          .
        </v-row>
      </v-col>
    </v-row>
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
