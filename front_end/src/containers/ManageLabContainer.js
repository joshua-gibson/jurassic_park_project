import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'
import PaddockFilterForm from '../components/PaddockFilterForm'
import DinoCardList from '../components/DinoCardList'
import '../style/ManagePaddockContainer.css';

class ManageLabContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            title: "Dinosaur Lab",
            dinosaurs: []
        };
    }

    componentDidMount() {
        const url = "http://localhost:8080/dinosaurs";

        fetch(url)
        .then(res => res.json())
        .then(dinosaurs => this.setState({dinosaurs: dinosaurs}))
        .catch(err => console.error);
    }

    render() {
        return (
            <div className="container">
                <PageTitleBar className="title" title={this.state.title}/>
                <PaddockFilterForm/>
                <DinoCardList dinosaurs={this.state.dinosaurs}/>

            </div>
        )
    }
}

export default ManageLabContainer;