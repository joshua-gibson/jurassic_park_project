import React, { Component } from 'react'
import BannerLogo from '../components/BannerLogo';
import NavBar from '../components/NavBar';

class HeaderContainer extends Component {
    render() {
        return (
            <div>
                <BannerLogo/>
                <NavBar/>
            </div>
        )
    }
}

export default HeaderContainer;