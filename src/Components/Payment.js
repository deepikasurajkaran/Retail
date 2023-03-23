import { useNavigate } from "react-router-dom";
import axios from "axios";
import { useState,useEffect } from "react";
function Payment(){
    const[payment,setPayment]=useState('');
    useEffect(() => {
        axios.get(`http://localhost:8089/loginuser/${localStorage.getItem('jwtToken')}`)
            .then(res => {
                axios.post(`http://localhost:9005/payment/pay`,{
                    "userid":res.data,
                    "totalprice":window.localStorage.getItem('totalprice'),
                })
                    .then(response => {
                        setPayment(response.data);
                    })
                    .finally(
                        console.log(payment)
                    )
            })
    }, []);
    // const onclickpay =(e)=>{
    //     <div>
    //     <h4>Payment Successful</h4>
    //     <p>
    //      Your Order is Confirmed
    //     </p>
    //     </div>
       
        

    // }
    

    return(
        <div>
            <h6>Payment Successful</h6>
            <h6>Order Confirmed</h6>
            {/* <button onClick = {e=>onclickpay(e)} type="submit">Make Payment</button> */}    
        </div>

    );
}
export default Payment;