var app = new Vue({
    el: '#app',
    data: {
        pageInfo:'',
        pageNum:1
    },
    mounted(){
        console.log('view mounted');
        
        this.searchReturn();
    },
    methods:{
        handlePageChange(val){
            console.log('page change click',val);
            this.pageNum = val;
            this.searchReturn();
        },
        searchReturn(){
            axios.get('/return/getList',{
                params:{
                    pageNum:this.pagNum
                }
            })
            .then(function(response){
                console.log(response);
                app.pageInfo = response.data;
            })
            .catch(function(error){
                console.log(error);
                
            })
        }
    }
})