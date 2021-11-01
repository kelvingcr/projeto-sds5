import DataTable from 'components/datatable';
import Fooder from 'components/fooder';
import NavBar from 'components/navbar';
import React from 'react';

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1>Olá mundo</h1>
        <DataTable />
      </div>  
      <Fooder />
    </>
  );
}

export default App;
