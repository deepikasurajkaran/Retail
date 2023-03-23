import axios from "axios";
import { useState } from "react";
import './Signup.css';
// import { useNavigate } from "react-router-dom";
import {Link} from "react-router-dom";

const Register =()=>{
    // let nav = useNavigate();
    const [name,setname]=useState('');
    const [email,setemail]=useState('');
    const [pass,setpass]=useState('');
    const [phone,setphone]=useState('');
    function handleSubmit(e){
        e.preventDefault();
        axios.post("http://localhost:8082/api/users/signup",
        {
             "name":name,
             "email":email,
             "password":pass,
             "phonenumber":phone

        }).then(res=>{
            console.log(res.data)
            if(res.status===200){
                alert(res.data)
            }
        })
        .catch(error=>{
            console.log(error)
        })

    }
    const namehandler=(event)=>{
        setname(event.target.value);
    }
    const emailhandler=(event)=>{
        setemail(event.target.value);
    }
    const passhandler=(event)=>{
        setpass(event.target.value);
    }
    const phonehandler=(event)=>{
        setphone(event.target.value);
    }
    return(
        <div className="bg-img">
            <form className="form" onSubmit={(e)=>handleSubmit(e)}>
                <h1>Register Here!</h1>
                <label for="fullname">Full Name</label>
                <input type="text" id = "fullname" autoComplete='off' value={name} onChange={namehandler}/>
                <label for="email">Email</label>
                <input type="email" id ="email" autoComplete='off' value={email} onChange={emailhandler}></input>
                <label for="password">Password</label>
                <input type="password" id="password" autoComplete='off' value={pass} onChange={passhandler}/>
                <label for="phonenumber">phonenumber</label>
                <input type="tel" id="phonenumber" autoComplete='off' value={phone} onChange={phonehandler}/>
                <button type="submit" >Register</button>
                <br></br>
                {/* onClick={(e)=>nav("/")} */}
                <p>Already have an account?<Link to="/login">Login here</Link></p>
            </form>
           
        </div>

    );
}
export default Register;