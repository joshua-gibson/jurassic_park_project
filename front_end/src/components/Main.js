import React, { Component } from 'react'
import HeaderContainer from '../containers/HeaderContainer'
import ParkMgmtContainer from '../containers/ParkMgmtContainer'
import ManageDinosContainer from '../containers/ManageDinosContainer'
import ManageLabContainer from '../containers/ManageLabContainer'
import ManagePaddockContainer from '../containers/ManagePaddockContainer'
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
                <Route path="/dinos" component={ManageLabContainer}/>
                <Route path="/lab" component={ManageDinosContainer}/>
                <Route path="/paddocks" component={ManagePaddockContainer}/>
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