// import { useState, useEffect } from "react";
// import axios from "axios";
// import CartItemsUser from "./CartItemsUser";
// import Checkout from "./Checkout";
// function Cart() {

//     const [cartItems, setCartItems] = useState([]);
//     useEffect(() => {
//         // const cartHandler = (e) => {
//         // const user="";
//         async function fetchData() {
//             axios.get(`http://localhost:8089/loginuser/${localStorage.getItem('jwtToken')}`)
//                 .then(res => {
//                     axios.get(`http://localhost:8095/api/userid/${res.data}`)
//                         .then(response => {
//                             setCartItems(response.data);
//                             console.log(response.data);
//                         })
//                 })
//         }
//         fetchData();
//     }, []);
//     <Checkout cartItems={cartItems}/>
//     return (
//         <div>
//             <CartItemsUser cartItems={cartItems} setCartItems={setCartItems}/>
            

//         </div>

//     );

// }

// export default Cart;