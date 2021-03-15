<template>
  <v-container>
    <v-formcd  action="/post">
      <v-text-field
        v-model="inputText"
        label="送信内容"
        placeholder="送信内容"
      ></v-text-field>
      <v-btn color="success" @click="postIndex">送信</v-btn>
    </v-formcd>
  </v-container>
</template>

<script>
import axios from 'axios';

export default {
  name: 'Content',
  methods: {
    postIndex() {
      console.log("クリックイベント" + wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwthis.inputText);
      axios.post(
        '/',
        {
          inputText: this.inputText
        }
      ).then(res => {
        console.log(res.data);
      }).catch(res => {
        console.log(res);
      })
    }
  },
}
</script>
