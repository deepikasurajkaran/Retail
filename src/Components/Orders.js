import { useState, useEffect } from "react";
import axios from "axios";
function Orders() {
    const [order, setorders] = useState([]);

    // useEffect(() => {
    //     axios.get(`http://localhost:8089/loginuser/${localStorage.getItem('jwtToken')}`)
    //         .then(res => {
    //             axios.get(`http://localhost:8098/orders/getorders/${res.data}`)
    //                 .then(response => {
    //                     setorders(response.data);
    //                 }).finally(
    //                     console.log(order)
    //                 )
    //         })
    // },[]);
    useEffect(() => {
        async function fetchData() {
            axios.get(`http://localhost:8089/loginuser/${localStorage.getItem('jwtToken')}`)
                .then(res => {
                    axios.get(`http://localhost:8098/orders/getorders/${res.data}`)
                    .then(response => {
                        setorders(response.data);
                    }).finally(
                        console.log(order)
                    )
                })
        }
        fetchData();
    }, []);



    return (
        <>
            <table className="table ">
                <thead>
                    <tr>
                        <th>OrderId</th>
                        {/* <th>ProductId</th> */}
                        <th>Product Name</th>
                        <th>Quantity</th>
                        <th>Price</th>
                    </tr>
                </thead>
                <tbody>
                {
                        order.map(ord =>
                            ((ord.products).split(",")).map(o =>
                                
                                <tr>
                                    <td>{ord.id}</td>
                                    <td>{o.split("-")[0]}</td>
                                    <td>{o.split("-")[1]}</td>
                                    <td>{o.split("-")[2]}</td>
                                </tr>

                            )

                        )
                    }
                </tbody>
            </table>
        </>
    )


}
export default Orders;