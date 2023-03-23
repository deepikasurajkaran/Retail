import './Header.css';
import {HiOutlineMail} from 'react-icons/hi';
const Header=()=>{
    return(
        <>
        <section className="head">
            <div className='container d_flex'>
            <div className="left row">
                <i className='fa fa-envelope'></i>
                <label><HiOutlineMail/>retailmanagement@gmail.com</label>
            </div>
            
            </div>

        </section>
        </>
    )
}
export default Header;