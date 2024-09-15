<template>
  <v-container>
    <v-data-table :headers="headers" :items="indexedItems" item-key="commentId" :items-per-page-options="pages"
      items-per-page-text="表示行数" class="elevation-1">
      <template v-slot:top>
        <v-toolbar flat>
          <v-toolbar-title>コメント一覧</v-toolbar-title>
        </v-toolbar>
      </template>
      <template v-slot:[`item.commentId`]="{ item }">
        <v-list-item-content>
          <v-list-item-title>{{ item.commentId }}</v-list-item-title>
        </v-list-item-content>
      </template>
      <template v-slot:[`item.comment`]="{ item }">
        <v-list-item-content>
          <v-list-item-title>{{ item.comment }}</v-list-item-title>
        </v-list-item-content>
      </template>
      <template v-slot:[`item.isActive`]="{ item }">
        <v-list-item-content>
          <v-list-item-subtitle>{{ item.active }}</v-list-item-subtitle>
        </v-list-item-content>
      </template>
      <template v-slot:[`item.createDate`]="{ item }">
        <v-list-item-content>
          <v-list-item-subtitle>{{ item.createDate }}</v-list-item-subtitle>
        </v-list-item-content>
      </template>
      <template v-slot:[`item.updateDate`]="{ item }">
        <v-list-item-content>
          <v-list-item-subtitle>{{ item.updateDate }}</v-list-item-subtitle>
        </v-list-item-content>
      </template>
    </v-data-table>
  </v-container>
</template>

<script>
import { callCommentFindAll } from '../libs/api/apiCall';
import { convDateTIme } from '../libs/common/dateUtil';

export default {
  name: 'CommentDataList',
  data() {
    return {
      pages: [
        { value: 5, title: '5' },
        { value: 10, title: '10' },
        { value: 20, title: '20' },
        { value: -1, title: '$vuetify.dataFooter.itemsPerPageAll' }
      ],
      headers: [
        {
          title: 'ID',
          key: 'commentId',
          align: 'end',
          sortable: false,
        },
        { title: 'コメント', align: 'start', key: 'comment' },
        // TODO プロパティ名が"isXXX"のデータをaxiosで取得すると先頭の"is"が抜ける？？
        { title: '有効フラグ', align: 'start', key: 'active' },
        { title: '登録日次', align: 'start', key: 'createDate' },
        { title: '更新日時', align: 'start', key: 'updateDate' }
      ],
      commentData: [],
    };
  },
  mounted() {
    this.loadCommentData();
  },
  methods: {
    async loadCommentData() {
      let resData = await callCommentFindAll();
      this.commentData = resData.data.data;
      console.log("test:" + JSON.stringify(this.commentData));
    }
  },
  computed: {
    indexedItems() {
      return this.commentData.map((item) => ({
        ...item,
        createDate: convDateTIme(item.createDate),
        updateDate: convDateTIme(item.updateDate),
      }))
    }
  }

};
</script>
