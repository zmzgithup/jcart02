var app = new Vue({
    el: '#app',
    data: {
        productId:'',
        productCode:'',
        productName:'',
        price:'',
        discount:'',
        description:'',
        stockQuantity:'',
        mainPicUrl:'',
        otherPicUrls:[]
    },
    computed:{
        otherPicUrlsJson(){
            return this.otherPicUrls.toString();
        }
    },
    mounted(){
        console.log('view mounted');

        var url = new URL(location.href);
        this.productId = url.searchParams.get("productId");
        if(!this.productId){
            alert('productId is null')
            return;
        }


        this.getProductById();
    },
    methods:{
        getProductById(){
            axios.get('http://localhost:8081/product/getById',{
                params:{
                    productId:this.productId
                }
            })
            .then(function(response){
                console.log(response);
                var product = response.data;
                app.productId = product.productId;
                app.productCode = product.productCode;
                app.productName = product.productName;
                app.price = product.price;
                app.discount = product.discount;
                app.description = product.description;
                app.stockQuantity = product.stockQuantity;
                app.mainPicUrl = product.mainPicUrl;
                app.otherPicUrls = product.otherPicUrls;
            })
            .catch(function(error){
                console.log(error);
            })
        }
    }
    
})