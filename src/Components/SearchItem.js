import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './products.css';
import { Button } from 'react-bootstrap';
import './SearchItem.css';
function SearchItem() {
    const [query, setQuery] = useState('');
    const [product, setProduct] = useState([]);

    const handleSubmit = async (event) => {
        event.preventDefault();
        try {
            const response = await axios.get(`http://localhost:9006/search/productname/${query}`);
            setProduct(response.data);
            console.log(response.data)
        } catch (error) {
            console.error(error);
            // handle error
        }
    }

    return (
        <div >

            
            <form  onSubmit={handleSubmit}>
                <label htmlFor='searchitem'>Search</label>
                <input type="text" id='searchitem' value={query} onChange={(event) => setQuery(event.target.value)} />
                <button type="submit">Search</button>
            </form>
            
            
            <div className="product container">
                <div className='row'>
                {product.map((p) => (
                    <div className='col-md-4 product' key={p.id}>
                        <img src={p.imageUrl} alt={p.name} />
                        <div>
                            <h2>{p.name}</h2>
                            <p>{p.description}</p>
                            <br></br>
                            <Button>Price:{p.price}</Button>
                            <br></br>
                        </div>
                        
                    </div>
                    

                ))}
            </div>
            </div>
        </div>
    );
}

export default SearchItem;