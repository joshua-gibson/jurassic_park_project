import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'
import PaddockFilterForm from '../components/PaddockFilterForm'
import DinoCardList from '../components/DinoCardList'
import '../style/ManagePaddockContainer.css';

class ManageDinosContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            title: "Manage Dinosaurs",
            dinosaurs: [],
            paddocks: []
        };
        this.filterByPaddock=this.filterByPaddock.bind(this);
    }

    componentDidMount() {
        const url = "http://localhost:8080/dinosaurs";
        const url2 = "http://localhost:8080/parks/paddocks";

        fetch(url)
        .then(res => res.json())
        .then(dinosaurs => this.setState({dinosaurs: dinosaurs}))
        .catch(err => console.error);

        fetch(url2)
        .then(res => res.json())
        .then(paddocks => this.setState({
            paddocks: paddocks
        }))
        .catch(err => console.error);
    }

    filterByPaddock(paddockID){
        const url = `http://localhost:8080/paddocks/${paddockID}/dinosaurs`;
        console.log(url)
        fetch(url)
        .then(res => res.json())
        .then(res => res._embedded.dinosaurs)
        .then(dinosaurs => this.setState({dinosaurs: dinosaurs}))
        .catch(err => console.error);
    }

    render() {
        return (
            <div className="container">
                <PageTitleBar className="title" title={this.state.title}/>
                <PaddockFilterForm filterByPaddock={this.filterByPaddock} paddocks={this.state.paddocks}/>
                <DinoCardList dinosaurs={this.state.dinosaurs}/>

            </div>
        )
    }
}

export default ManageDinosContainer;