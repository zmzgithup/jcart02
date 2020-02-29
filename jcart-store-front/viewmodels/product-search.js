var app = new Vue({
    el: '#app',
    data: {
        pageInfo:'',
        pageNum:1
    },
    mounted(){
        console.log('view mounted');
        this.searchProduct();
    },
    methods:{
        searchProduct(){
            axios.get('http://localhost:8081/product/search',{
                params:{
                    pageNum:this.pageNum
                }
            })
            .then(function(response){
                console.log(response);
                app.pageInfo = response.data;
            })
            .catch(function(error){
                console.log(error);
            })
        },
        handlePageChange(val){
            console.log('page click');
            this.pageNum = 1;
            this.searchProduct();
        }
    }
})