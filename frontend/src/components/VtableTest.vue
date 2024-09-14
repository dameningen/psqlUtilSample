<template>
  <v-container>
    <p class="text-h3">DataTable</p>
    <v-data-table :headers="headers" :items="indexedItems" :items-per-page-options="pages" items-per-page-text="表示行数"
      class="elevation-1"></v-data-table>
  </v-container>
</template>

<script>
//import { reactive, onMounted } from "vue";
import { callFindAll } from '../libs/api/apiCall';
import { convDateTIme } from '../libs/common/dateUtil';

export default {
  data() {
    return {

      itemsPerPage: 5,
      pages: [
        { value: 5, title: '5' },
        { value: 10, title: '10' },
        { value: 20, title: '20' },
        { value: -1, title: '$vuetify.dataFooter.itemsPerPageAll' }
      ],
      headers: [
        {
          title: '番号',
          align: 'end',
          sortable: false,
          key: 'paymentId',
        },
        { title: '顧客ID', align: 'start', key: 'customerId' },
        { title: '支払日', align: 'start', key: 'paymentDate' },
      ],
      paymentData: [
      ],
    }
  },
  async mounted() {
    let resData = await callFindAll();
    this.paymentData = resData.data.data;
    console.log("test:" + JSON.stringify(this.paymentData));
  },
  computed: {
    indexedItems() {
      return this.paymentData.map((item) => ({
        ...item,
        paymentDate: convDateTIme(item.paymentDate),
      }))
    }
  }

}
</script>