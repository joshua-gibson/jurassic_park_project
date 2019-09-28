import React, { Component } from 'react'
import HeaderContainer from './HeaderContainer';
import PageTitleBar from '../components/PageTitleBar'

class ManageDinosContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            title: "Manage Dinosaurs"
        };
    }

    render() {
        return (
            <>
                <PageTitleBar title={this.state.title}/>
                <h1>Manage Dinosaurs Container</h1>

            </>
        )
    }
}

export default ManageDinosContainer;