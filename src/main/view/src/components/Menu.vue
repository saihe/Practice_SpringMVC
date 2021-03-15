<template>
  <v-navigation-drawer app clipped>
    <v-expansion-panels multiple>
      <v-expansion-panel>
        <v-expansion-panel-header>商品管理</v-expansion-panel-header>
        <v-expansion-panel-content>
          <v-list>
            <v-list-item>
              <v-btn text>在庫管理</v-btn>
            </v-list-item>
            <v-list-item>
              <v-btn text>商品マスタ管理</v-btn>
            </v-list-item>
          </v-list>
        </v-expansion-panel-content>
      </v-expansion-panel>
      <v-expansion-panel>
        <v-expansion-panel-header>アカウント管理</v-expansion-panel-header>
        <v-expansion-panel-content>
          <v-list>
            <v-list-item>アカウント追加</v-list-item>
          </v-list>
        </v-expansion-panel-content>
      </v-expansion-panel>
    </v-expansion-panels>
  </v-navigation-drawer>
</template>
