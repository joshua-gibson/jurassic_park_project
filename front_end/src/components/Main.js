import React, { Component } from 'react'
import HeaderContainer from '../containers/HeaderContainer'
import ParkMgmtContainer from '../containers/ParkMgmtContainer'
import ManageDinosContainer from '../containers/ManageDinosContainer'
import ErrorPage from '../components/ErrorPage'
import {BrowserRouter as Router, Route, Switch} from "react-router-dom";

class Main extends Component {
    constructor() {
        super();
        this.state = { 
          
        };
      }


    render() {
        return (
            <Router>
            <React.Fragment>
            <HeaderContainer />
              <Switch>
                <Route exact path="/" component={ParkMgmtContainer}/>
                <Route path="/dinos" component={ManageDinosContainer}/>
                {/* <Route 
                  path="/pricing" 
                  render= {()=> <Pricing prices={this.state.pricing}/>}
                /> */}
                <Route  component={ErrorPage}/>
              </Switch>
            </React.Fragment>
          </Router>
        )
    }
}
export default Main;