import React from 'react';
import LabCard from './LabCard'
import '../style/card.css'


const LabCardList = (props) => {

    const dinos = props.dinosaurs.map((dinosaur, index) => {
        return <LabCard 
        key = {index}
        name={dinosaur.type} 
        avatar={dinosaur.dietType.charAt(0)} 
        image={dinosaur.url} 
        content={dinosaur.info}
        paddocks={props.paddocks}
        />

    })


    return ( 
    <div className="card">
    {dinos}
    </div>
    );

}

export default LabCardList;