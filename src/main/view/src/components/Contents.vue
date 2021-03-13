<template>
  <v-container>
    <v-form action="/post">
      <v-text-field
        name="inputText"
        label="送信内容"
        id="inputText"
        placeholder="送信内容"
      ></v-text-field>
      <v-btn color="success" type="submit">送信</v-btn>
    </v-form>
  </v-container>
</template>

<script>
  export default {
    name: 'Content'
  }
</script>
