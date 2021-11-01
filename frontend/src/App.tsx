import BarChart from 'components/barchart';
import DataTable from 'components/datatable';
import DonutChart from 'components/donutchart';
import Fooder from 'components/fooder';
import NavBar from 'components/navbar';
import React from 'react';

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary px-3">Dashboard de Vendas</h1>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de Sucesso</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
          <h5 className="text-center text-secondary">Taxa de Sucesso</h5>
            <DonutChart />
          </div>
        </div>

        <div className="py-3">
          <h2 className="text-primary">Todas vendas</h2>
        </div>
        <DataTable />
      </div>  
      <Fooder />
    </>
  );
}

export default App;
