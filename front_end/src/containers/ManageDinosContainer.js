import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'
import PaddockFilterForm from '../components/PaddockFilterForm'
import DinoCardList from '../components/DinoCardList'

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
                <PaddockFilterForm/>
                <DinoCardList/>

            </>
        )
    }
}

export default ManageDinosContainer;