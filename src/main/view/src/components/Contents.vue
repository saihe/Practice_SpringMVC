<template>
  <v-container>
    <v-formcd  action="/post">
      <v-text-field
        v-model="inputText"
        label="送信内容"
        placeholder="送信内容"
      ></v-text-field>
      <v-btn color="success" @click="postIndex">送信</v-btn>
      <span v-text="contents" />
    </v-formcd>
  </v-container>
</template>

<script>
import axios from 'axios';

export default {
  name: 'Content',
  data() {
    return {
      contents: "まだAPI読んでない"
    };
  },
  methods: {
    postIndex() {
      console.log("クリックイベント" + this.inputText);
      axios.post(
        '/',
        {
          inputText: this.inputText
        }
      ).then(res => {
        console.log(res.data);
        this.contents = res.data.inputText;
      }).catch(res => {
        console.log(res);
      })
    }
  },
}
</script>
