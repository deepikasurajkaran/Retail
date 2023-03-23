import axios from "axios";
function handleRemoveFromCart(productid){
    if(user){
        axios.get(`http://localhost:8095/api/userid/${userid}`)
        .then((response)=>{
            const cartid = response.data.cartid;
            axios.delete(`http://localhost:8095/api/delete/${cartid}`)
            .then((response)=>{
                setCartItems(prevCartItems=>{
                    const updatedCartItems=prevCartItems.filter((item)=>item.productid!==productid);
                    return updatedCartItems;
                });
            })
            .catch((error)=>{

            });
        })
        .catch((error)=>{

        });
    }else{
        alert("you must be logged into remove items from your cart");
        window.location.href='/login';
    }
   
}