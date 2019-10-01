import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import clsx from 'clsx';
import Card from '@material-ui/core/Card';
import CardHeader from '@material-ui/core/CardHeader';
import CardMedia from '@material-ui/core/CardMedia';
import CardContent from '@material-ui/core/CardContent';
import CardActions from '@material-ui/core/CardActions';
import Collapse from '@material-ui/core/Collapse';
import Avatar from '@material-ui/core/Avatar';
import IconButton from '@material-ui/core/IconButton';
import Typography from '@material-ui/core/Typography';
import { red } from '@material-ui/core/colors';
import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
import Icon from '@material-ui/core/Icon';



const useStyles = makeStyles(theme => ({
  card: {
    maxWidth: 345,
    margin: "20px"
  },
  media: {
    // height: 0,
    // paddingTop: '56.25%', // 16:9
    height: '276px',
    width: '100%',
    objectFit: 'contain'
  },
  expand: {
    transform: 'rotate(0deg)',
    marginLeft: 'auto',
    transition: theme.transitions.create('transform', {
      duration: theme.transitions.duration.shortest,
    }),
  },
  expandOpen: {
    transform: 'rotate(180deg)',
  },
  avatar: {
    backgroundColor: red[500],
    },
      root: {
        '& > span': {
          margin: theme.spacing(2),
        },
      },
      iconHover: {
        '&:hover': {
          color: red[800],
        },
      },
    }));

export default function DinosaurCard(props) {
  const classes = useStyles();
  const [expanded, setExpanded] = React.useState(false);


  const handleExpandClick = () => {
    setExpanded(!expanded);
  };

  return (
    <Card className={classes.card}>
      <CardHeader 
      avatar=<Avatar 
      aria-label="DinosaurCard" 
      className={classes.avatar}>
           {props.avatar}
          </Avatar>

        title={props.name}
        subheader={props.subheader}
      />
      <CardMedia
        className={classes.media}
        image={props.image}
        component="img"
      />
   <CardContent>
        <Typography variant="body2" color="textSecondary" component="p" >{props.content}
</Typography>
    </CardContent>
    <div className={classes.root}>
      <Icon>add_circle</Icon>
    </div>
    <CardActions disableSpacing>
      <IconButton
           className={clsx(classes.expand, {
             [classes.expandOpen]: expanded,
           })}
           onClick={handleExpandClick}
           aria-expanded={expanded}
           aria-label="show more"
         >
           <ExpandMoreIcon />
         </IconButton>
       </CardActions>
       <Collapse in={expanded} timeout="auto" unmountOnExit>
         <CardContent>

           {/* <Typography paragraph>Facts:</Typography>
           <Typography paragraph>
            {props.facts}
          </Typography> */}

            <form>
                <label>Name: </label>
            <input type="text" name="name"/>
            </form> 

        </CardContent>
      </Collapse>
    </Card>

  );
}
