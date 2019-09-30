import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'
import '../style/ManagePaddockContainer.css';

class ManagePaddockContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            title: "Manage Paddocks"
        };
    }

    render() {
        return (
            <div className="container">
                <PageTitleBar className="title" title={this.state.title}/>
                <h1>Manage Paddock Container</h1>

                {/* test images */}
                <h3>Test Images for paddock cards</h3>
                <img src="./images/paddock_coniferous.png" alt="test img"/>
                <img src="./images/paddock_desert.png" alt="test img"/>
                <img src="./images/paddock_mediterranean.png" alt="test img"/>
                <img src="./images/paddock_mountain.png" alt="test img"/>
                <img src="./images/paddock_prarie.png" alt="test img"/>
                <img src="./images/paddock_savannah.png" alt="test img"/>
                <img src="./images/paddock_temperate.png" alt="test img"/>
                <img src="./images/paddock_tropical.png" alt="test img"/>
                <img src="./images/paddock_tundra.png" alt="test img"/>
            </div>
        )
    }
}

export default ManagePaddockContainer;