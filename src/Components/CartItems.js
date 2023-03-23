import { useState,useEffect } from "react";
import axios from "axios";
function CartItems({products}){
    const[email,setEmail]=useState(null);
    const[cartItems,setCartItems]=useState([]);
    useEffect(()=>{
        const fetchUser = async()=>{
            const response=await axios.get(`http://localhost:8089/loginuser/${localStorage.getItem('jwtToken')}`);
            // const data = response.data;
            // console.log(response.data);
            console.log(response.data);
            setEmail(response.data.email);
            console.log(setEmail);
        };
        fetchUser();
    },[]);
    useEffect(()=>{
        const fetchCartItems = async()=>{
            const response=await axios.get(`http://localhost:8095/api/userid/${email}`);
            const data = await response.data;
            setCartItems(data);
        };
        if(email){
            fetchCartItems();
        }
    },[email]);
    // const handleQuantityChange=(itemId,newQuantity)=>{
    //     const updatedCartItems = cartItems.map(item=>{
    //         if(item.cartid === itemId){
    //             return{
    //                 ...item,quantity:newQuantity};
    //         }else{
    //             return item;
    //         }
    //     });
    //     setCartItems(updatedCartItems);
    // };
    const cartItemsWithPrice = cartItems.map(item=>{
        const product= products.find(product => product.productid===item.productid);
        return{
            ...item,
            price: product.price,
            name:product.name
        };
    });
    // const totalprice=cartItemsWithPrice.reduce((accumulator,item)=>accumulator+item.quantity*item.price,0);
    return(
        <div>
            <ul>
                {cartItemsWithPrice.map(item=>(
                    <li key={item.cartid}>
                        <div>
                            {item.name}-${item.price.toFixed(2)}
                        </div>
                        {/* <div>
                        <button onClick={()=> handleQuantityChange(item.cartid,item.quantity-1)}>-</button>
                        <span>{item.quantity}</span>
                        <button onClick={()=>handleQuantityChange(item.cartid,item.quantity+1)}>+</button>
                        </div> */}

                    </li>
                ))}
            </ul>
            {/* {email && (
                <div>
                    <p>Total Price:${totalprice.toFixed(2)}</p>
                    </div>
            )} */}
        </div>
    )
}
export default CartItems;