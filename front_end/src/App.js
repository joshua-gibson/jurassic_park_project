import React, { Component } from 'react';
import HeaderContainer from './containers/HeaderContainer';
import ParkMgmtContainer from './containers/ParkMgmtContainer';

class App extends Component {
  render() {
    return (
      <>
        <HeaderContainer />
        <ParkMgmtContainer />
      </>
    );
  }
}

export default App;
