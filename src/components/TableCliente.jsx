import React, {useEffect , useState} from 'react'
import lapiz from '../img/lapiz.png';
import basura from '../img/basura.png';
import axios from 'axios'


const TableCliente = () => {

    const [users , setUsers] = useState({documents:[]})
    useEffect(() =>{
        const fetchUsersList = async () => {
            const {data} = await axios(
              "http://132.226.215.159:8080/tarea" 
            );
            setUsers({documents:data});
            console.log(data);
        };
        fetchUsersList();
    }, [setUsers]);

    return (
        <div>
           <table className="table table-hover">
  <thead>
    <tr>
     {/*  <th scope="col">Id</th> */}
      <th scope="col">Titulo</th>
      <th scope="col">Contenido</th>
      {/* <th scope="col">Telefono</th>
      <th scope="col">Acciones</th> */}
    </tr>
  </thead>
  <tbody>
        {users.documents &&
        users.documents.map((item) =>(
        <tr key={item.id}>
            {/* <td>{item.id}</td> */}
            <td>{item.nombre}</td>
            <td>{item.apellido}</td>
            
           {/*  <td>{item.telefono}</td>  */}
            <td><button className="btn btn-primary" >
              <img src={lapiz} style={{ height: 30 }} />
              </button> {"   "} 
              <button className="btn btn-danger">
              <img src={basura} style={{ height: 30 }} />
                </button></td>       
        </tr>
        ))
        }    
  </tbody>
</table> 
        </div>
    )
}

export default TableCliente
