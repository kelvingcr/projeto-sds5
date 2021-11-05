import Dashboard from "pages/dashboard";
import Home from "pages/home";
import { Switch } from "react-router-dom";
import { BrowserRouter, Route } from "react-router-dom";

function Rountes() {
    return (
        <BrowserRouter> 
            <Switch>
                <Route path="/" exact >
                    <Home />
                </Route>
                <Route path="/dashboard">
                    <Dashboard />
                </Route>
            </Switch>


        </BrowserRouter>
    );
}

export default Rountes;