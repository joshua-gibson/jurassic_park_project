import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'
import PaddockFilterForm from '../components/PaddockFilterForm'
import DinoCardList from '../components/DinoCardList'
import '../style/ManagePaddockContainer.css';

class ManageDinosContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            title: "Manage Dinosaurs"
        };
    }

    render() {
        return (
            <div className="container">
                <PageTitleBar className="title" title={this.state.title}/>
                <h1>Manage Dinosaurs Container</h1>
                <PaddockFilterForm/>
                <DinoCardList/>

            </div>
        )
    }
}

export default ManageDinosContainer;