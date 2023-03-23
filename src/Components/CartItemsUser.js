import axios from "axios";
import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import { Button } from "react-bootstrap";
function CartItemsUser() {
    const [cartItems, setCartItems] = useState([]);
    useEffect(() => {
        async function fetchData() {
            axios.get(`http://localhost:8089/loginuser/${localStorage.getItem('jwtToken')}`)
                .then(res => {
                    console.log(res.data)
                    axios.get(`http://localhost:8095/api/userid/${res.data}`)
                        .then(response => {
                            setCartItems(response.data);
                            console.log(response.data);
                        })
                })
        }
        fetchData();
    }, []);

    useEffect(() => {
        console.log(cartItems);
    }, [cartItems]);

    const handleQuantityChange = (itemId, newQuantity) => {
        const updatedCartItems = cartItems.map(item => {
            if (item.cartid === itemId) {
                return {
                    ...item, quantity: newQuantity
                };
            } else {
                return item;
            }
        });
        setCartItems(updatedCartItems);
        const cartItem = updatedCartItems.find(item=>item.cartid===itemId);
        axios.post(`http://localhost:8095/api/quantity`,cartItem);
    };

    const handleDelete=(itemId)=>{
        axios.delete(`http://localhost:8095/api/delete/${itemId}`)
        .then(response=>{
            setCartItems(cartItems.filter(item=>item.cartid !== itemId));
        })
        .catch(error => console.error(error));
    }
    const totalprice = cartItems.map(item=>item.quantity*item.price).reduce((accumulator,currentValue)=>accumulator+currentValue,0);
    return (
        <div>
            <>
                <table className="table ">
                    <thead>
                        <tr>
                            <th>CartId</th>
                            <th>Product</th>
                            <th>Quantity</th>
                            <th>Remove</th>
                            <th>Price</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                        {cartItems.map(item => (
                            <tr>
                                <td>{item.cartid}</td>
                                <td>{item.name}</td>
                                <td>
                                    <div>
                                        <button onClick={() => handleQuantityChange(item.cartid, item.quantity - 1)}>-</button>
                                        <span>{item.quantity}</span>
                                        <button onClick={() => handleQuantityChange(item.cartid, item.quantity + 1)}>+</button>
                                    </div>
                                </td>
                                <td>
                                    <Button onClick={()=>handleDelete(item.cartid)}>Delete</Button>
                                </td>
                                <td>${item.quantity * item.price}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
                <br></br>
                <h5>Total Price of all products : ${totalprice}</h5>
                {/* <button onClick={handlePlaceOrder}>Place Order</button> */}
                <Link to="/checkout" className="btn btn-dark mx-4 mr-auto  ">Place Order</Link>
               
            </>
        </div>
    );
}
export default CartItemsUser;