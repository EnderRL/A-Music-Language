// $ANTLR 3.4 src/parser/Music.g 2017-04-25 20:05:46

package parser;
    import interpreter.AmlTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MusicParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARMOR", "ASSIG", "ATTR_ACCESS", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DECR", "DIMINUTION", "DIV", "DIVIDE_ASSIG", "DOT", "DOUBLE_BAR", "DRUMS", "DRUMS_NOTE_TYPE", "DRUMS_TRACK", "ELSE", "ELSEIF", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FOR", "FRAGMENT", "FUNCALL", "FUNCTION", "GE", "GT", "ID", "IF", "INCR", "INSTRUMENT", "INT", "LE", "LETTER_X", "LIST_ARGUMENTS", "LIST_ASSIG", "LIST_FUNCTIONS", "LIST_INSTRUCTIONS", "LIST_MUSIC_INST", "LT", "MAJ7", "MINOR", "MINUS", "MINUS_ASSIG", "MOD", "MOD_ASSIG", "NOT", "NOTE", "NOTES", "NOTE_LIST", "NOTE_TYPE", "NOT_EQUAL", "NUM", "OR", "PLUS", "PLUS_ASSIG", "POST", "PRE", "PROD_ASSIG", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "STRING_TYPE", "SUSTAIN", "TIE", "TONE", "TRACK", "TRANSPORT", "TRUE", "VAR_FUNCALL", "VOID", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int AND=4;
    public static final int ARMOR=5;
    public static final int ASSIG=6;
    public static final int ATTR_ACCESS=7;
    public static final int BAR=8;
    public static final int BEAT=9;
    public static final int BEMOL=10;
    public static final int BOOL=11;
    public static final int BOOLEAN=12;
    public static final int CHORD=13;
    public static final int COMMENT=14;
    public static final int COMPAS=15;
    public static final int COMPAS_LIST=16;
    public static final int DECR=17;
    public static final int DIMINUTION=18;
    public static final int DIV=19;
    public static final int DIVIDE_ASSIG=20;
    public static final int DOT=21;
    public static final int DOUBLE_BAR=22;
    public static final int DRUMS=23;
    public static final int DRUMS_NOTE_TYPE=24;
    public static final int DRUMS_TRACK=25;
    public static final int ELSE=26;
    public static final int ELSEIF=27;
    public static final int END_REPETITION=28;
    public static final int EQUAL=29;
    public static final int ESC_SEQ=30;
    public static final int FALSE=31;
    public static final int FIGURE=32;
    public static final int FOR=33;
    public static final int FRAGMENT=34;
    public static final int FUNCALL=35;
    public static final int FUNCTION=36;
    public static final int GE=37;
    public static final int GT=38;
    public static final int ID=39;
    public static final int IF=40;
    public static final int INCR=41;
    public static final int INSTRUMENT=42;
    public static final int INT=43;
    public static final int LE=44;
    public static final int LETTER_X=45;
    public static final int LIST_ARGUMENTS=46;
    public static final int LIST_ASSIG=47;
    public static final int LIST_FUNCTIONS=48;
    public static final int LIST_INSTRUCTIONS=49;
    public static final int LIST_MUSIC_INST=50;
    public static final int LT=51;
    public static final int MAJ7=52;
    public static final int MINOR=53;
    public static final int MINUS=54;
    public static final int MINUS_ASSIG=55;
    public static final int MOD=56;
    public static final int MOD_ASSIG=57;
    public static final int NOT=58;
    public static final int NOTE=59;
    public static final int NOTES=60;
    public static final int NOTE_LIST=61;
    public static final int NOTE_TYPE=62;
    public static final int NOT_EQUAL=63;
    public static final int NUM=64;
    public static final int OR=65;
    public static final int PLUS=66;
    public static final int PLUS_ASSIG=67;
    public static final int POST=68;
    public static final int PRE=69;
    public static final int PROD_ASSIG=70;
    public static final int REPETITION=71;
    public static final int RETURN=72;
    public static final int SEVENTH=73;
    public static final int SONG=74;
    public static final int SPEED=75;
    public static final int START_REPETITION=76;
    public static final int STRING=77;
    public static final int STRING_TYPE=78;
    public static final int SUSTAIN=79;
    public static final int TIE=80;
    public static final int TONE=81;
    public static final int TRACK=82;
    public static final int TRANSPORT=83;
    public static final int TRUE=84;
    public static final int VAR_FUNCALL=85;
    public static final int VOID=86;
    public static final int WHILE=87;
    public static final int WS=88;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MusicParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MusicParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MusicParser.tokenNames; }
    public String getGrammarFileName() { return "src/parser/Music.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // src/parser/Music.g:40:1: prog : ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) ;
    public final MusicParser.prog_return prog() throws RecognitionException {
        MusicParser.prog_return retval = new MusicParser.prog_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EOF2=null;
        MusicParser.global_stmt_return global_stmt1 =null;


        AmlTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_global_stmt=new RewriteRuleSubtreeStream(adaptor,"rule global_stmt");
        try {
            // src/parser/Music.g:40:10: ( ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) )
            // src/parser/Music.g:40:14: ( global_stmt )+ EOF
            {
            // src/parser/Music.g:40:14: ( global_stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BOOL||LA1_0==CHORD||LA1_0==DRUMS_NOTE_TYPE||LA1_0==FRAGMENT||LA1_0==INT||LA1_0==NOTE_TYPE||LA1_0==SONG||LA1_0==STRING_TYPE||LA1_0==VOID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/parser/Music.g:40:15: global_stmt
            	    {
            	    pushFollow(FOLLOW_global_stmt_in_prog186);
            	    global_stmt1=global_stmt();

            	    state._fsp--;

            	    stream_global_stmt.add(global_stmt1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog190);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: global_stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 40:33: -> ^( LIST_FUNCTIONS ( global_stmt )+ )
            {
                // src/parser/Music.g:40:36: ^( LIST_FUNCTIONS ( global_stmt )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_global_stmt.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_global_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_global_stmt.nextTree());

                }
                stream_global_stmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class global_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "global_stmt"
    // src/parser/Music.g:43:1: global_stmt : ( function | frag | song );
    public final MusicParser.global_stmt_return global_stmt() throws RecognitionException {
        MusicParser.global_stmt_return retval = new MusicParser.global_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.function_return function3 =null;

        MusicParser.frag_return frag4 =null;

        MusicParser.song_return song5 =null;



        try {
            // src/parser/Music.g:43:13: ( function | frag | song )
            int alt2=3;
            switch ( input.LA(1) ) {
            case BOOL:
            case CHORD:
            case DRUMS_NOTE_TYPE:
            case INT:
            case NOTE_TYPE:
            case STRING_TYPE:
            case VOID:
                {
                alt2=1;
                }
                break;
            case FRAGMENT:
                {
                alt2=2;
                }
                break;
            case SONG:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // src/parser/Music.g:43:17: function
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_global_stmt222);
                    function3=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function3.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:44:17: frag
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_frag_in_global_stmt240);
                    frag4=frag();

                    state._fsp--;

                    adaptor.addChild(root_0, frag4.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:45:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_global_stmt258);
                    song5=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song5.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "global_stmt"


    public static class var_funcall_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_funcall"
    // src/parser/Music.g:48:1: var_funcall : id= id_rule '.' id2= id_rule '(' ( params )? ')' ';' -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? ) ;
    public final MusicParser.var_funcall_return var_funcall() throws RecognitionException {
        MusicParser.var_funcall_return retval = new MusicParser.var_funcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal6=null;
        Token char_literal7=null;
        Token char_literal9=null;
        Token char_literal10=null;
        MusicParser.id_rule_return id =null;

        MusicParser.id_rule_return id2 =null;

        MusicParser.params_return params8 =null;


        AmlTree char_literal6_tree=null;
        AmlTree char_literal7_tree=null;
        AmlTree char_literal9_tree=null;
        AmlTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:48:13: (id= id_rule '.' id2= id_rule '(' ( params )? ')' ';' -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? ) )
            // src/parser/Music.g:48:17: id= id_rule '.' id2= id_rule '(' ( params )? ')' ';'
            {
            pushFollow(FOLLOW_id_rule_in_var_funcall283);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal6=(Token)match(input,92,FOLLOW_92_in_var_funcall285);  
            stream_92.add(char_literal6);


            pushFollow(FOLLOW_id_rule_in_var_funcall289);
            id2=id_rule();

            state._fsp--;

            stream_id_rule.add(id2.getTree());

            char_literal7=(Token)match(input,89,FOLLOW_89_in_var_funcall291);  
            stream_89.add(char_literal7);


            // src/parser/Music.g:48:48: ( params )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ARMOR||LA3_0==BEMOL||LA3_0==CHORD||LA3_0==DRUMS||LA3_0==FALSE||LA3_0==ID||LA3_0==LETTER_X||LA3_0==MINUS||(LA3_0 >= NOT && LA3_0 <= NOTE)||LA3_0==NUM||LA3_0==PLUS||LA3_0==STRING||LA3_0==SUSTAIN||LA3_0==TRUE||LA3_0==89) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/parser/Music.g:48:48: params
                    {
                    pushFollow(FOLLOW_params_in_var_funcall293);
                    params8=params();

                    state._fsp--;

                    stream_params.add(params8.getTree());

                    }
                    break;

            }


            char_literal9=(Token)match(input,90,FOLLOW_90_in_var_funcall296);  
            stream_90.add(char_literal9);


            char_literal10=(Token)match(input,94,FOLLOW_94_in_var_funcall298);  
            stream_94.add(char_literal10);


            // AST REWRITE
            // elements: id2, params
            // token labels: 
            // rule labels: retval, id2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_id2=new RewriteRuleSubtreeStream(adaptor,"rule id2",id2!=null?id2.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 48:65: -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? )
            {
                // src/parser/Music.g:48:69: ^( VAR_FUNCALL[$id.text] $id2 ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(VAR_FUNCALL, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                adaptor.addChild(root_1, stream_id2.nextTree());

                // src/parser/Music.g:48:98: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_funcall"


    public static class var_access_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_access"
    // src/parser/Music.g:51:1: var_access : (id1= id_rule ( '.' id2= id_rule ) -> ^( ATTR_ACCESS[$id1.text] $id2) | id_rule );
    public final MusicParser.var_access_return var_access() throws RecognitionException {
        MusicParser.var_access_return retval = new MusicParser.var_access_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal11=null;
        MusicParser.id_rule_return id1 =null;

        MusicParser.id_rule_return id2 =null;

        MusicParser.id_rule_return id_rule12 =null;


        AmlTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        try {
            // src/parser/Music.g:51:13: (id1= id_rule ( '.' id2= id_rule ) -> ^( ATTR_ACCESS[$id1.text] $id2) | id_rule )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID||LA4_0==LETTER_X) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==92) ) {
                    alt4=1;
                }
                else if ( (LA4_1==AND||LA4_1==ASSIG||LA4_1==DECR||(LA4_1 >= DIV && LA4_1 <= DOT)||LA4_1==EQUAL||(LA4_1 >= GE && LA4_1 <= GT)||LA4_1==INCR||LA4_1==LE||LA4_1==LT||(LA4_1 >= MINUS && LA4_1 <= MOD_ASSIG)||LA4_1==NOT_EQUAL||(LA4_1 >= OR && LA4_1 <= PLUS_ASSIG)||LA4_1==PROD_ASSIG||(LA4_1 >= 90 && LA4_1 <= 91)||LA4_1==94) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // src/parser/Music.g:51:17: id1= id_rule ( '.' id2= id_rule )
                    {
                    pushFollow(FOLLOW_id_rule_in_var_access339);
                    id1=id_rule();

                    state._fsp--;

                    stream_id_rule.add(id1.getTree());

                    // src/parser/Music.g:51:29: ( '.' id2= id_rule )
                    // src/parser/Music.g:51:30: '.' id2= id_rule
                    {
                    char_literal11=(Token)match(input,92,FOLLOW_92_in_var_access342);  
                    stream_92.add(char_literal11);


                    pushFollow(FOLLOW_id_rule_in_var_access346);
                    id2=id_rule();

                    state._fsp--;

                    stream_id_rule.add(id2.getTree());

                    }


                    // AST REWRITE
                    // elements: id2
                    // token labels: 
                    // rule labels: retval, id2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_id2=new RewriteRuleSubtreeStream(adaptor,"rule id2",id2!=null?id2.tree:null);

                    root_0 = (AmlTree)adaptor.nil();
                    // 51:47: -> ^( ATTR_ACCESS[$id1.text] $id2)
                    {
                        // src/parser/Music.g:51:50: ^( ATTR_ACCESS[$id1.text] $id2)
                        {
                        AmlTree root_1 = (AmlTree)adaptor.nil();
                        root_1 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(ATTR_ACCESS, (id1!=null?input.toString(id1.start,id1.stop):null))
                        , root_1);

                        adaptor.addChild(root_1, stream_id2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:52:17: id_rule
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_id_rule_in_var_access375);
                    id_rule12=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule12.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_access"


    public static class id_rule_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_rule"
    // src/parser/Music.g:55:1: id_rule : ( ID | LETTER_X );
    public final MusicParser.id_rule_return id_rule() throws RecognitionException {
        MusicParser.id_rule_return retval = new MusicParser.id_rule_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set13=null;

        AmlTree set13_tree=null;

        try {
            // src/parser/Music.g:55:13: ( ID | LETTER_X )
            // src/parser/Music.g:
            {
            root_0 = (AmlTree)adaptor.nil();


            set13=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==LETTER_X ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set13)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id_rule"


    public static class function_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // src/parser/Music.g:59:1: function : type_void id= id_rule '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) ;
    public final MusicParser.function_return function() throws RecognitionException {
        MusicParser.function_return retval = new MusicParser.function_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal15=null;
        Token char_literal17=null;
        Token char_literal18=null;
        Token char_literal20=null;
        MusicParser.id_rule_return id =null;

        MusicParser.type_void_return type_void14 =null;

        MusicParser.list_arguments_return list_arguments16 =null;

        MusicParser.listInst_return listInst19 =null;


        AmlTree char_literal15_tree=null;
        AmlTree char_literal17_tree=null;
        AmlTree char_literal18_tree=null;
        AmlTree char_literal20_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_list_arguments=new RewriteRuleSubtreeStream(adaptor,"rule list_arguments");
        RewriteRuleSubtreeStream stream_type_void=new RewriteRuleSubtreeStream(adaptor,"rule type_void");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        try {
            // src/parser/Music.g:59:13: ( type_void id= id_rule '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) )
            // src/parser/Music.g:59:16: type_void id= id_rule '(' list_arguments ')' '{' listInst '}'
            {
            pushFollow(FOLLOW_type_void_in_function445);
            type_void14=type_void();

            state._fsp--;

            stream_type_void.add(type_void14.getTree());

            pushFollow(FOLLOW_id_rule_in_function449);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal15=(Token)match(input,89,FOLLOW_89_in_function451);  
            stream_89.add(char_literal15);


            pushFollow(FOLLOW_list_arguments_in_function453);
            list_arguments16=list_arguments();

            state._fsp--;

            stream_list_arguments.add(list_arguments16.getTree());

            char_literal17=(Token)match(input,90,FOLLOW_90_in_function455);  
            stream_90.add(char_literal17);


            char_literal18=(Token)match(input,95,FOLLOW_95_in_function457);  
            stream_95.add(char_literal18);


            pushFollow(FOLLOW_listInst_in_function459);
            listInst19=listInst();

            state._fsp--;

            stream_listInst.add(listInst19.getTree());

            char_literal20=(Token)match(input,96,FOLLOW_96_in_function461);  
            stream_96.add(char_literal20);


            // AST REWRITE
            // elements: listInst, list_arguments, type_void
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 59:80: -> ^( FUNCTION[$id.text] type_void list_arguments listInst )
            {
                // src/parser/Music.g:59:85: ^( FUNCTION[$id.text] type_void list_arguments listInst )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCTION, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                adaptor.addChild(root_1, stream_type_void.nextTree());

                adaptor.addChild(root_1, stream_list_arguments.nextTree());

                adaptor.addChild(root_1, stream_listInst.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class funcall_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // src/parser/Music.g:62:1: funcall : id= id_rule '(' ( params )? ')' -> ^( FUNCALL[$id.text] ( params )? ) ;
    public final MusicParser.funcall_return funcall() throws RecognitionException {
        MusicParser.funcall_return retval = new MusicParser.funcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal21=null;
        Token char_literal23=null;
        MusicParser.id_rule_return id =null;

        MusicParser.params_return params22 =null;


        AmlTree char_literal21_tree=null;
        AmlTree char_literal23_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:62:13: (id= id_rule '(' ( params )? ')' -> ^( FUNCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:62:17: id= id_rule '(' ( params )? ')'
            {
            pushFollow(FOLLOW_id_rule_in_funcall508);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal21=(Token)match(input,89,FOLLOW_89_in_funcall510);  
            stream_89.add(char_literal21);


            // src/parser/Music.g:62:32: ( params )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ARMOR||LA5_0==BEMOL||LA5_0==CHORD||LA5_0==DRUMS||LA5_0==FALSE||LA5_0==ID||LA5_0==LETTER_X||LA5_0==MINUS||(LA5_0 >= NOT && LA5_0 <= NOTE)||LA5_0==NUM||LA5_0==PLUS||LA5_0==STRING||LA5_0==SUSTAIN||LA5_0==TRUE||LA5_0==89) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // src/parser/Music.g:62:32: params
                    {
                    pushFollow(FOLLOW_params_in_funcall512);
                    params22=params();

                    state._fsp--;

                    stream_params.add(params22.getTree());

                    }
                    break;

            }


            char_literal23=(Token)match(input,90,FOLLOW_90_in_funcall515);  
            stream_90.add(char_literal23);


            // AST REWRITE
            // elements: params
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 62:44: -> ^( FUNCALL[$id.text] ( params )? )
            {
                // src/parser/Music.g:62:47: ^( FUNCALL[$id.text] ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCALL, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                // src/parser/Music.g:62:67: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class frag_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "frag"
    // src/parser/Music.g:65:1: frag : FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.frag_return frag() throws RecognitionException {
        MusicParser.frag_return retval = new MusicParser.frag_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FRAGMENT24=null;
        Token char_literal26=null;
        Token char_literal28=null;
        Token char_literal29=null;
        Token char_literal31=null;
        MusicParser.id_rule_return id_rule25 =null;

        MusicParser.list_arguments_return list_arguments27 =null;

        MusicParser.list_music_inst_return list_music_inst30 =null;


        AmlTree FRAGMENT24_tree=null;
        AmlTree char_literal26_tree=null;
        AmlTree char_literal28_tree=null;
        AmlTree char_literal29_tree=null;
        AmlTree char_literal31_tree=null;

        try {
            // src/parser/Music.g:65:9: ( FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:65:11: FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FRAGMENT24=(Token)match(input,FRAGMENT,FOLLOW_FRAGMENT_in_frag549); 
            FRAGMENT24_tree = 
            (AmlTree)adaptor.create(FRAGMENT24)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FRAGMENT24_tree, root_0);


            pushFollow(FOLLOW_id_rule_in_frag552);
            id_rule25=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule25.getTree());

            char_literal26=(Token)match(input,89,FOLLOW_89_in_frag554); 

            pushFollow(FOLLOW_list_arguments_in_frag557);
            list_arguments27=list_arguments();

            state._fsp--;

            adaptor.addChild(root_0, list_arguments27.getTree());

            char_literal28=(Token)match(input,90,FOLLOW_90_in_frag559); 

            char_literal29=(Token)match(input,95,FOLLOW_95_in_frag562); 

            pushFollow(FOLLOW_list_music_inst_in_frag565);
            list_music_inst30=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst30.getTree());

            char_literal31=(Token)match(input,96,FOLLOW_96_in_frag567); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "frag"


    public static class list_arguments_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_arguments"
    // src/parser/Music.g:68:1: list_arguments : ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) ;
    public final MusicParser.list_arguments_return list_arguments() throws RecognitionException {
        MusicParser.list_arguments_return retval = new MusicParser.list_arguments_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal33=null;
        MusicParser.argument_return argument32 =null;

        MusicParser.argument_return argument34 =null;


        AmlTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // src/parser/Music.g:68:17: ( ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) )
            // src/parser/Music.g:68:19: ( argument ( ',' argument )* )?
            {
            // src/parser/Music.g:68:19: ( argument ( ',' argument )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==BOOL||LA7_0==CHORD||LA7_0==DRUMS_NOTE_TYPE||LA7_0==INT||LA7_0==NOTE_TYPE||LA7_0==STRING_TYPE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // src/parser/Music.g:68:20: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_list_arguments587);
                    argument32=argument();

                    state._fsp--;

                    stream_argument.add(argument32.getTree());

                    // src/parser/Music.g:68:29: ( ',' argument )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==91) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // src/parser/Music.g:68:30: ',' argument
                    	    {
                    	    char_literal33=(Token)match(input,91,FOLLOW_91_in_list_arguments590);  
                    	    stream_91.add(char_literal33);


                    	    pushFollow(FOLLOW_argument_in_list_arguments592);
                    	    argument34=argument();

                    	    state._fsp--;

                    	    stream_argument.add(argument34.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            // AST REWRITE
            // elements: argument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 68:47: -> ^( LIST_ARGUMENTS ( argument )* )
            {
                // src/parser/Music.g:68:50: ^( LIST_ARGUMENTS ( argument )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_ARGUMENTS, "LIST_ARGUMENTS")
                , root_1);

                // src/parser/Music.g:68:67: ( argument )*
                while ( stream_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_argument.nextTree());

                }
                stream_argument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_arguments"


    public static class argument_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument"
    // src/parser/Music.g:71:1: argument : type ^ id_rule ;
    public final MusicParser.argument_return argument() throws RecognitionException {
        MusicParser.argument_return retval = new MusicParser.argument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.type_return type35 =null;

        MusicParser.id_rule_return id_rule36 =null;



        try {
            // src/parser/Music.g:71:11: ( type ^ id_rule )
            // src/parser/Music.g:71:15: type ^ id_rule
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_argument633);
            type35=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type35.getTree(), root_0);

            pushFollow(FOLLOW_id_rule_in_argument636);
            id_rule36=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule36.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argument"


    public static class params_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // src/parser/Music.g:74:1: params : ( expr | notes_variable ) ( ',' ! ( expr | notes_variable ) )* ;
    public final MusicParser.params_return params() throws RecognitionException {
        MusicParser.params_return retval = new MusicParser.params_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal39=null;
        MusicParser.expr_return expr37 =null;

        MusicParser.notes_variable_return notes_variable38 =null;

        MusicParser.expr_return expr40 =null;

        MusicParser.notes_variable_return notes_variable41 =null;


        AmlTree char_literal39_tree=null;

        try {
            // src/parser/Music.g:74:13: ( ( expr | notes_variable ) ( ',' ! ( expr | notes_variable ) )* )
            // src/parser/Music.g:74:17: ( expr | notes_variable ) ( ',' ! ( expr | notes_variable ) )*
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:74:17: ( expr | notes_variable )
            int alt8=2;
            switch ( input.LA(1) ) {
            case FALSE:
            case ID:
            case LETTER_X:
            case MINUS:
            case NOT:
            case NUM:
            case PLUS:
            case STRING:
            case TRUE:
                {
                alt8=1;
                }
                break;
            case 89:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==FALSE||LA8_2==ID||LA8_2==LETTER_X||LA8_2==MINUS||LA8_2==NOT||LA8_2==NUM||LA8_2==PLUS||LA8_2==STRING||LA8_2==TRUE||LA8_2==89) ) {
                    alt8=1;
                }
                else if ( (LA8_2==ARMOR||LA8_2==BEMOL||LA8_2==NOTE||LA8_2==SUSTAIN) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;

                }
                }
                break;
            case ARMOR:
            case BEMOL:
            case CHORD:
            case DRUMS:
            case NOTE:
            case SUSTAIN:
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // src/parser/Music.g:74:18: expr
                    {
                    pushFollow(FOLLOW_expr_in_params663);
                    expr37=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr37.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:74:25: notes_variable
                    {
                    pushFollow(FOLLOW_notes_variable_in_params667);
                    notes_variable38=notes_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, notes_variable38.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:74:41: ( ',' ! ( expr | notes_variable ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==91) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/parser/Music.g:74:42: ',' ! ( expr | notes_variable )
            	    {
            	    char_literal39=(Token)match(input,91,FOLLOW_91_in_params671); 

            	    // src/parser/Music.g:74:47: ( expr | notes_variable )
            	    int alt9=2;
            	    switch ( input.LA(1) ) {
            	    case FALSE:
            	    case ID:
            	    case LETTER_X:
            	    case MINUS:
            	    case NOT:
            	    case NUM:
            	    case PLUS:
            	    case STRING:
            	    case TRUE:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 89:
            	        {
            	        int LA9_2 = input.LA(2);

            	        if ( (LA9_2==FALSE||LA9_2==ID||LA9_2==LETTER_X||LA9_2==MINUS||LA9_2==NOT||LA9_2==NUM||LA9_2==PLUS||LA9_2==STRING||LA9_2==TRUE||LA9_2==89) ) {
            	            alt9=1;
            	        }
            	        else if ( (LA9_2==ARMOR||LA9_2==BEMOL||LA9_2==NOTE||LA9_2==SUSTAIN) ) {
            	            alt9=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 9, 2, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case ARMOR:
            	    case BEMOL:
            	    case CHORD:
            	    case DRUMS:
            	    case NOTE:
            	    case SUSTAIN:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // src/parser/Music.g:74:48: expr
            	            {
            	            pushFollow(FOLLOW_expr_in_params675);
            	            expr40=expr();

            	            state._fsp--;

            	            adaptor.addChild(root_0, expr40.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:74:55: notes_variable
            	            {
            	            pushFollow(FOLLOW_notes_variable_in_params679);
            	            notes_variable41=notes_variable();

            	            state._fsp--;

            	            adaptor.addChild(root_0, notes_variable41.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class listInst_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listInst"
    // src/parser/Music.g:77:1: listInst : ( inst )+ -> ^( LIST_INSTRUCTIONS ( inst )+ ) ;
    public final MusicParser.listInst_return listInst() throws RecognitionException {
        MusicParser.listInst_return retval = new MusicParser.listInst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.inst_return inst42 =null;


        RewriteRuleSubtreeStream stream_inst=new RewriteRuleSubtreeStream(adaptor,"rule inst");
        try {
            // src/parser/Music.g:77:13: ( ( inst )+ -> ^( LIST_INSTRUCTIONS ( inst )+ ) )
            // src/parser/Music.g:77:16: ( inst )+
            {
            // src/parser/Music.g:77:16: ( inst )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==BEAT||LA11_0==BOOL||LA11_0==CHORD||LA11_0==DECR||LA11_0==DOUBLE_BAR||LA11_0==DRUMS_NOTE_TYPE||LA11_0==FOR||(LA11_0 >= ID && LA11_0 <= INT)||LA11_0==LETTER_X||LA11_0==NOTE_TYPE||LA11_0==NUM||LA11_0==RETURN||(LA11_0 >= SONG && LA11_0 <= START_REPETITION)||LA11_0==STRING_TYPE||LA11_0==TONE||LA11_0==WHILE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/parser/Music.g:77:16: inst
            	    {
            	    pushFollow(FOLLOW_inst_in_listInst707);
            	    inst42=inst();

            	    state._fsp--;

            	    stream_inst.add(inst42.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            // AST REWRITE
            // elements: inst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 77:23: -> ^( LIST_INSTRUCTIONS ( inst )+ )
            {
                // src/parser/Music.g:77:26: ^( LIST_INSTRUCTIONS ( inst )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_INSTRUCTIONS, "LIST_INSTRUCTIONS")
                , root_1);

                if ( !(stream_inst.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_inst.hasNext() ) {
                    adaptor.addChild(root_1, stream_inst.nextTree());

                }
                stream_inst.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listInst"


    public static class list_music_inst_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_music_inst"
    // src/parser/Music.g:80:1: list_music_inst : ( music_inst )+ -> ^( LIST_MUSIC_INST ( music_inst )+ ) ;
    public final MusicParser.list_music_inst_return list_music_inst() throws RecognitionException {
        MusicParser.list_music_inst_return retval = new MusicParser.list_music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst43 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:80:17: ( ( music_inst )+ -> ^( LIST_MUSIC_INST ( music_inst )+ ) )
            // src/parser/Music.g:80:21: ( music_inst )+
            {
            // src/parser/Music.g:80:21: ( music_inst )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ARMOR||(LA12_0 >= BEAT && LA12_0 <= BOOL)||LA12_0==CHORD||LA12_0==DECR||(LA12_0 >= DRUMS && LA12_0 <= DRUMS_NOTE_TYPE)||LA12_0==FOR||(LA12_0 >= ID && LA12_0 <= INT)||LA12_0==LETTER_X||LA12_0==NOTE||LA12_0==NOTE_TYPE||(LA12_0 >= SONG && LA12_0 <= SPEED)||(LA12_0 >= STRING_TYPE && LA12_0 <= SUSTAIN)||LA12_0==TONE||LA12_0==WHILE||LA12_0==89) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/parser/Music.g:80:21: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_list_music_inst741);
            	    music_inst43=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst43.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            // AST REWRITE
            // elements: music_inst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 80:33: -> ^( LIST_MUSIC_INST ( music_inst )+ )
            {
                // src/parser/Music.g:80:36: ^( LIST_MUSIC_INST ( music_inst )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_MUSIC_INST, "LIST_MUSIC_INST")
                , root_1);

                if ( !(stream_music_inst.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_music_inst.hasNext() ) {
                    adaptor.addChild(root_1, stream_music_inst.nextTree());

                }
                stream_music_inst.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_music_inst"


    public static class inst_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inst"
    // src/parser/Music.g:83:1: inst : ( declaration | 'return' ^ ( expr | notes_group ) ';' !| var_funcall | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| assignation | while_stmt | funcall ';' !| for_stmt | if_stmt | song | compas_list );
    public final MusicParser.inst_return inst() throws RecognitionException {
        MusicParser.inst_return retval = new MusicParser.inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token string_literal45=null;
        Token char_literal48=null;
        Token char_literal51=null;
        Token char_literal53=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token char_literal61=null;
        MusicParser.declaration_return declaration44 =null;

        MusicParser.expr_return expr46 =null;

        MusicParser.notes_group_return notes_group47 =null;

        MusicParser.var_funcall_return var_funcall49 =null;

        MusicParser.tone_return tone50 =null;

        MusicParser.beat_return beat52 =null;

        MusicParser.speed_return speed54 =null;

        MusicParser.instrument_return instrument56 =null;

        MusicParser.assignation_return assignation58 =null;

        MusicParser.while_stmt_return while_stmt59 =null;

        MusicParser.funcall_return funcall60 =null;

        MusicParser.for_stmt_return for_stmt62 =null;

        MusicParser.if_stmt_return if_stmt63 =null;

        MusicParser.song_return song64 =null;

        MusicParser.compas_list_return compas_list65 =null;


        AmlTree string_literal45_tree=null;
        AmlTree char_literal48_tree=null;
        AmlTree char_literal51_tree=null;
        AmlTree char_literal53_tree=null;
        AmlTree char_literal55_tree=null;
        AmlTree char_literal57_tree=null;
        AmlTree char_literal61_tree=null;

        try {
            // src/parser/Music.g:83:13: ( declaration | 'return' ^ ( expr | notes_group ) ';' !| var_funcall | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| assignation | while_stmt | funcall ';' !| for_stmt | if_stmt | song | compas_list )
            int alt14=14;
            switch ( input.LA(1) ) {
            case BOOL:
            case CHORD:
            case DRUMS_NOTE_TYPE:
            case INT:
            case NOTE_TYPE:
            case STRING_TYPE:
                {
                alt14=1;
                }
                break;
            case RETURN:
                {
                alt14=2;
                }
                break;
            case ID:
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 92:
                    {
                    int LA14_14 = input.LA(3);

                    if ( (LA14_14==ID||LA14_14==LETTER_X) ) {
                        int LA14_16 = input.LA(4);

                        if ( (LA14_16==89) ) {
                            alt14=3;
                        }
                        else if ( (LA14_16==ASSIG||LA14_16==DECR||LA14_16==DIVIDE_ASSIG||LA14_16==INCR||LA14_16==MINUS_ASSIG||LA14_16==MOD_ASSIG||LA14_16==PLUS_ASSIG||LA14_16==PROD_ASSIG) ) {
                            alt14=8;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 16, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 14, input);

                        throw nvae;

                    }
                    }
                    break;
                case ASSIG:
                case DECR:
                case DIVIDE_ASSIG:
                case INCR:
                case MINUS_ASSIG:
                case MOD_ASSIG:
                case PLUS_ASSIG:
                case PROD_ASSIG:
                    {
                    alt14=8;
                    }
                    break;
                case 89:
                    {
                    alt14=10;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;

                }

                }
                break;
            case TONE:
                {
                alt14=4;
                }
                break;
            case BEAT:
                {
                alt14=5;
                }
                break;
            case SPEED:
                {
                alt14=6;
                }
                break;
            case INSTRUMENT:
                {
                alt14=7;
                }
                break;
            case DECR:
            case INCR:
                {
                alt14=8;
                }
                break;
            case WHILE:
                {
                alt14=9;
                }
                break;
            case FOR:
                {
                alt14=11;
                }
                break;
            case IF:
                {
                alt14=12;
                }
                break;
            case SONG:
                {
                alt14=13;
                }
                break;
            case DOUBLE_BAR:
            case NUM:
            case START_REPETITION:
                {
                alt14=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // src/parser/Music.g:83:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst785);
                    declaration44=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration44.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:84:17: 'return' ^ ( expr | notes_group ) ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    string_literal45=(Token)match(input,RETURN,FOLLOW_RETURN_in_inst803); 
                    string_literal45_tree = 
                    (AmlTree)adaptor.create(string_literal45)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(string_literal45_tree, root_0);


                    // src/parser/Music.g:84:27: ( expr | notes_group )
                    int alt13=2;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID:
                    case LETTER_X:
                    case MINUS:
                    case NOT:
                    case NUM:
                    case PLUS:
                    case STRING:
                    case TRUE:
                        {
                        alt13=1;
                        }
                        break;
                    case 89:
                        {
                        int LA13_2 = input.LA(2);

                        if ( (LA13_2==FALSE||LA13_2==ID||LA13_2==LETTER_X||LA13_2==MINUS||LA13_2==NOT||LA13_2==NUM||LA13_2==PLUS||LA13_2==STRING||LA13_2==TRUE||LA13_2==89) ) {
                            alt13=1;
                        }
                        else if ( (LA13_2==ARMOR||LA13_2==BEMOL||LA13_2==NOTE||LA13_2==SUSTAIN) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case DRUMS:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt13=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }

                    switch (alt13) {
                        case 1 :
                            // src/parser/Music.g:84:28: expr
                            {
                            pushFollow(FOLLOW_expr_in_inst807);
                            expr46=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr46.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:84:35: notes_group
                            {
                            pushFollow(FOLLOW_notes_group_in_inst811);
                            notes_group47=notes_group();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_group47.getTree());

                            }
                            break;

                    }


                    char_literal48=(Token)match(input,94,FOLLOW_94_in_inst814); 

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:85:17: var_funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_inst833);
                    var_funcall49=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall49.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:86:17: tone ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_inst851);
                    tone50=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone50.getTree());

                    char_literal51=(Token)match(input,94,FOLLOW_94_in_inst853); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:87:17: beat ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_inst872);
                    beat52=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat52.getTree());

                    char_literal53=(Token)match(input,94,FOLLOW_94_in_inst874); 

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:88:17: speed ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_inst893);
                    speed54=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed54.getTree());

                    char_literal55=(Token)match(input,94,FOLLOW_94_in_inst895); 

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:89:17: instrument ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_inst914);
                    instrument56=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument56.getTree());

                    char_literal57=(Token)match(input,94,FOLLOW_94_in_inst916); 

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:90:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst935);
                    assignation58=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation58.getTree());

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:91:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst953);
                    while_stmt59=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt59.getTree());

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:92:17: funcall ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_inst971);
                    funcall60=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall60.getTree());

                    char_literal61=(Token)match(input,94,FOLLOW_94_in_inst973); 

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:93:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst992);
                    for_stmt62=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt62.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:94:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst1010);
                    if_stmt63=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt63.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:95:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst1028);
                    song64=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song64.getTree());

                    }
                    break;
                case 14 :
                    // src/parser/Music.g:96:17: compas_list
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_compas_list_in_inst1046);
                    compas_list65=compas_list();

                    state._fsp--;

                    adaptor.addChild(root_0, compas_list65.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inst"


    public static class music_inst_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "music_inst"
    // src/parser/Music.g:99:1: music_inst : ( declaration | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| var_funcall | assignation | while_music_stmt | funcall ';' !| for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? );
    public final MusicParser.music_inst_return music_inst() throws RecognitionException {
        MusicParser.music_inst_return retval = new MusicParser.music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal68=null;
        Token char_literal70=null;
        Token char_literal72=null;
        Token char_literal74=null;
        Token char_literal79=null;
        Token char_literal84=null;
        MusicParser.declaration_return declaration66 =null;

        MusicParser.tone_return tone67 =null;

        MusicParser.beat_return beat69 =null;

        MusicParser.speed_return speed71 =null;

        MusicParser.instrument_return instrument73 =null;

        MusicParser.var_funcall_return var_funcall75 =null;

        MusicParser.assignation_return assignation76 =null;

        MusicParser.while_music_stmt_return while_music_stmt77 =null;

        MusicParser.funcall_return funcall78 =null;

        MusicParser.for_music_stmt_return for_music_stmt80 =null;

        MusicParser.if_music_stmt_return if_music_stmt81 =null;

        MusicParser.song_return song82 =null;

        MusicParser.notes_group_return notes_group83 =null;


        AmlTree char_literal68_tree=null;
        AmlTree char_literal70_tree=null;
        AmlTree char_literal72_tree=null;
        AmlTree char_literal74_tree=null;
        AmlTree char_literal79_tree=null;
        AmlTree char_literal84_tree=null;

        try {
            // src/parser/Music.g:99:13: ( declaration | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| var_funcall | assignation | while_music_stmt | funcall ';' !| for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? )
            int alt17=13;
            switch ( input.LA(1) ) {
            case CHORD:
                {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==89) ) {
                    alt17=13;
                }
                else if ( (LA17_1==ID||LA17_1==LETTER_X) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;

                }
                }
                break;
            case TONE:
                {
                alt17=2;
                }
                break;
            case BEAT:
                {
                alt17=3;
                }
                break;
            case SPEED:
                {
                alt17=4;
                }
                break;
            case INSTRUMENT:
                {
                alt17=5;
                }
                break;
            case ID:
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 92:
                    {
                    int LA17_14 = input.LA(3);

                    if ( (LA17_14==ID||LA17_14==LETTER_X) ) {
                        int LA17_16 = input.LA(4);

                        if ( (LA17_16==89) ) {
                            alt17=6;
                        }
                        else if ( (LA17_16==ASSIG||LA17_16==DECR||LA17_16==DIVIDE_ASSIG||LA17_16==INCR||LA17_16==MINUS_ASSIG||LA17_16==MOD_ASSIG||LA17_16==PLUS_ASSIG||LA17_16==PROD_ASSIG) ) {
                            alt17=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 16, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 14, input);

                        throw nvae;

                    }
                    }
                    break;
                case ASSIG:
                case DECR:
                case DIVIDE_ASSIG:
                case INCR:
                case MINUS_ASSIG:
                case MOD_ASSIG:
                case PLUS_ASSIG:
                case PROD_ASSIG:
                    {
                    alt17=7;
                    }
                    break;
                case 89:
                    {
                    alt17=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 6, input);

                    throw nvae;

                }

                }
                break;
            case DECR:
            case INCR:
                {
                alt17=7;
                }
                break;
            case WHILE:
                {
                alt17=8;
                }
                break;
            case FOR:
                {
                alt17=10;
                }
                break;
            case IF:
                {
                alt17=11;
                }
                break;
            case SONG:
                {
                alt17=12;
                }
                break;
            case BOOL:
            case DRUMS_NOTE_TYPE:
            case INT:
            case NOTE_TYPE:
            case STRING_TYPE:
                {
                alt17=1;
                }
                break;
            case ARMOR:
            case BEMOL:
            case DRUMS:
            case NOTE:
            case SUSTAIN:
            case 89:
                {
                alt17=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // src/parser/Music.g:99:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_music_inst1070);
                    declaration66=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration66.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:100:17: tone ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_music_inst1088);
                    tone67=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone67.getTree());

                    char_literal68=(Token)match(input,94,FOLLOW_94_in_music_inst1090); 

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:101:17: beat ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_music_inst1109);
                    beat69=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat69.getTree());

                    char_literal70=(Token)match(input,94,FOLLOW_94_in_music_inst1111); 

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:102:17: speed ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_music_inst1130);
                    speed71=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed71.getTree());

                    char_literal72=(Token)match(input,94,FOLLOW_94_in_music_inst1132); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:103:17: instrument ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_music_inst1151);
                    instrument73=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument73.getTree());

                    char_literal74=(Token)match(input,94,FOLLOW_94_in_music_inst1153); 

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:104:17: var_funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_music_inst1172);
                    var_funcall75=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall75.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:105:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_music_inst1190);
                    assignation76=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation76.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:106:17: while_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_music_stmt_in_music_inst1208);
                    while_music_stmt77=while_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_music_stmt77.getTree());

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:107:17: funcall ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_music_inst1226);
                    funcall78=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall78.getTree());

                    char_literal79=(Token)match(input,94,FOLLOW_94_in_music_inst1228); 

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:108:17: for_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_music_stmt_in_music_inst1247);
                    for_music_stmt80=for_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_music_stmt80.getTree());

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:109:17: if_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_music_stmt_in_music_inst1265);
                    if_music_stmt81=if_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_music_stmt81.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:110:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_music_inst1283);
                    song82=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song82.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:111:16: ( options {greedy=true; } : notes_group )+ ( ';' !)?
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    // src/parser/Music.g:111:16: ( options {greedy=true; } : notes_group )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        switch ( input.LA(1) ) {
                        case CHORD:
                            {
                            alt15=1;
                            }
                            break;
                        case 89:
                            {
                            alt15=1;
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case SUSTAIN:
                            {
                            alt15=1;
                            }
                            break;
                        case NOTE:
                            {
                            alt15=1;
                            }
                            break;
                        case DRUMS:
                            {
                            alt15=1;
                            }
                            break;

                        }

                        switch (alt15) {
                    	case 1 :
                    	    // src/parser/Music.g:111:42: notes_group
                    	    {
                    	    pushFollow(FOLLOW_notes_group_in_music_inst1310);
                    	    notes_group83=notes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, notes_group83.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    // src/parser/Music.g:111:59: ( ';' !)?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==94) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // src/parser/Music.g:111:59: ';' !
                            {
                            char_literal84=(Token)match(input,94,FOLLOW_94_in_music_inst1314); 

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "music_inst"


    public static class declaration_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // src/parser/Music.g:114:1: declaration : type ^ assig_opt ( ',' ! assig_opt )* ';' !;
    public final MusicParser.declaration_return declaration() throws RecognitionException {
        MusicParser.declaration_return retval = new MusicParser.declaration_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal87=null;
        Token char_literal89=null;
        MusicParser.type_return type85 =null;

        MusicParser.assig_opt_return assig_opt86 =null;

        MusicParser.assig_opt_return assig_opt88 =null;


        AmlTree char_literal87_tree=null;
        AmlTree char_literal89_tree=null;

        try {
            // src/parser/Music.g:114:13: ( type ^ assig_opt ( ',' ! assig_opt )* ';' !)
            // src/parser/Music.g:114:17: type ^ assig_opt ( ',' ! assig_opt )* ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_declaration1339);
            type85=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type85.getTree(), root_0);

            pushFollow(FOLLOW_assig_opt_in_declaration1342);
            assig_opt86=assig_opt();

            state._fsp--;

            adaptor.addChild(root_0, assig_opt86.getTree());

            // src/parser/Music.g:114:33: ( ',' ! assig_opt )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==91) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // src/parser/Music.g:114:34: ',' ! assig_opt
            	    {
            	    char_literal87=(Token)match(input,91,FOLLOW_91_in_declaration1345); 

            	    pushFollow(FOLLOW_assig_opt_in_declaration1348);
            	    assig_opt88=assig_opt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig_opt88.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            char_literal89=(Token)match(input,94,FOLLOW_94_in_declaration1352); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class type_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // src/parser/Music.g:117:1: type : ( INT | BOOL | NOTE_TYPE | DRUMS_NOTE_TYPE | CHORD | STRING_TYPE );
    public final MusicParser.type_return type() throws RecognitionException {
        MusicParser.type_return retval = new MusicParser.type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set90=null;

        AmlTree set90_tree=null;

        try {
            // src/parser/Music.g:117:13: ( INT | BOOL | NOTE_TYPE | DRUMS_NOTE_TYPE | CHORD | STRING_TYPE )
            // src/parser/Music.g:
            {
            root_0 = (AmlTree)adaptor.nil();


            set90=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==CHORD||input.LA(1)==DRUMS_NOTE_TYPE||input.LA(1)==INT||input.LA(1)==NOTE_TYPE||input.LA(1)==STRING_TYPE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set90)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class type_void_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_void"
    // src/parser/Music.g:125:1: type_void : ( type | VOID );
    public final MusicParser.type_void_return type_void() throws RecognitionException {
        MusicParser.type_void_return retval = new MusicParser.type_void_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token VOID92=null;
        MusicParser.type_return type91 =null;


        AmlTree VOID92_tree=null;

        try {
            // src/parser/Music.g:125:13: ( type | VOID )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==BOOL||LA19_0==CHORD||LA19_0==DRUMS_NOTE_TYPE||LA19_0==INT||LA19_0==NOTE_TYPE||LA19_0==STRING_TYPE) ) {
                alt19=1;
            }
            else if ( (LA19_0==VOID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // src/parser/Music.g:125:17: type
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_type_void1498);
                    type91=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type91.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:126:17: VOID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    VOID92=(Token)match(input,VOID,FOLLOW_VOID_in_type_void1516); 
                    VOID92_tree = 
                    (AmlTree)adaptor.create(VOID92)
                    ;
                    adaptor.addChild(root_0, VOID92_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_void"


    public static class assig_opt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assig_opt"
    // src/parser/Music.g:129:1: assig_opt : id_rule ( ASSIG ^ ( expr | notes_variable ) )? ;
    public final MusicParser.assig_opt_return assig_opt() throws RecognitionException {
        MusicParser.assig_opt_return retval = new MusicParser.assig_opt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ASSIG94=null;
        MusicParser.id_rule_return id_rule93 =null;

        MusicParser.expr_return expr95 =null;

        MusicParser.notes_variable_return notes_variable96 =null;


        AmlTree ASSIG94_tree=null;

        try {
            // src/parser/Music.g:129:13: ( id_rule ( ASSIG ^ ( expr | notes_variable ) )? )
            // src/parser/Music.g:129:17: id_rule ( ASSIG ^ ( expr | notes_variable ) )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_id_rule_in_assig_opt1541);
            id_rule93=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule93.getTree());

            // src/parser/Music.g:129:25: ( ASSIG ^ ( expr | notes_variable ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ASSIG) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // src/parser/Music.g:129:26: ASSIG ^ ( expr | notes_variable )
                    {
                    ASSIG94=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_assig_opt1544); 
                    ASSIG94_tree = 
                    (AmlTree)adaptor.create(ASSIG94)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(ASSIG94_tree, root_0);


                    // src/parser/Music.g:129:33: ( expr | notes_variable )
                    int alt20=2;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID:
                    case LETTER_X:
                    case MINUS:
                    case NOT:
                    case NUM:
                    case PLUS:
                    case STRING:
                    case TRUE:
                        {
                        alt20=1;
                        }
                        break;
                    case 89:
                        {
                        int LA20_2 = input.LA(2);

                        if ( (LA20_2==FALSE||LA20_2==ID||LA20_2==LETTER_X||LA20_2==MINUS||LA20_2==NOT||LA20_2==NUM||LA20_2==PLUS||LA20_2==STRING||LA20_2==TRUE||LA20_2==89) ) {
                            alt20=1;
                        }
                        else if ( (LA20_2==ARMOR||LA20_2==BEMOL||LA20_2==NOTE||LA20_2==SUSTAIN) ) {
                            alt20=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case DRUMS:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt20=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }

                    switch (alt20) {
                        case 1 :
                            // src/parser/Music.g:129:34: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig_opt1548);
                            expr95=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr95.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:129:41: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig_opt1552);
                            notes_variable96=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable96.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assig_opt"


    public static class assignation_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignation"
    // src/parser/Music.g:132:1: assignation : assig ';' !;
    public final MusicParser.assignation_return assignation() throws RecognitionException {
        MusicParser.assignation_return retval = new MusicParser.assignation_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal98=null;
        MusicParser.assig_return assig97 =null;


        AmlTree char_literal98_tree=null;

        try {
            // src/parser/Music.g:132:13: ( assig ';' !)
            // src/parser/Music.g:132:17: assig ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_assig_in_assignation1578);
            assig97=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig97.getTree());

            char_literal98=(Token)match(input,94,FOLLOW_94_in_assignation1580); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignation"


    public static class assig_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assig"
    // src/parser/Music.g:135:1: assig : ( var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | FIGURE ) | post | pre );
    public final MusicParser.assig_return assig() throws RecognitionException {
        MusicParser.assig_return retval = new MusicParser.assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set100=null;
        Token FIGURE103=null;
        MusicParser.var_access_return var_access99 =null;

        MusicParser.expr_return expr101 =null;

        MusicParser.notes_variable_return notes_variable102 =null;

        MusicParser.post_return post104 =null;

        MusicParser.pre_return pre105 =null;


        AmlTree set100_tree=null;
        AmlTree FIGURE103_tree=null;

        try {
            // src/parser/Music.g:135:13: ( var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | FIGURE ) | post | pre )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID||LA23_0==LETTER_X) ) {
                switch ( input.LA(2) ) {
                case 92:
                    {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3==ID||LA23_3==LETTER_X) ) {
                        int LA23_6 = input.LA(4);

                        if ( (LA23_6==ASSIG||LA23_6==DIVIDE_ASSIG||LA23_6==MINUS_ASSIG||LA23_6==MOD_ASSIG||LA23_6==PLUS_ASSIG||LA23_6==PROD_ASSIG) ) {
                            alt23=1;
                        }
                        else if ( (LA23_6==DECR||LA23_6==INCR) ) {
                            alt23=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 3, input);

                        throw nvae;

                    }
                    }
                    break;
                case ASSIG:
                case DIVIDE_ASSIG:
                case MINUS_ASSIG:
                case MOD_ASSIG:
                case PLUS_ASSIG:
                case PROD_ASSIG:
                    {
                    alt23=1;
                    }
                    break;
                case DECR:
                case INCR:
                    {
                    alt23=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA23_0==DECR||LA23_0==INCR) ) {
                alt23=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // src/parser/Music.g:135:17: var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | FIGURE )
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_assig1610);
                    var_access99=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access99.getTree());

                    set100=(Token)input.LT(1);

                    set100=(Token)input.LT(1);

                    if ( input.LA(1)==ASSIG||input.LA(1)==DIVIDE_ASSIG||input.LA(1)==MINUS_ASSIG||input.LA(1)==MOD_ASSIG||input.LA(1)==PLUS_ASSIG||input.LA(1)==PROD_ASSIG ) {
                        input.consume();
                        root_0 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(set100)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // src/parser/Music.g:135:94: ( expr | notes_variable | FIGURE )
                    int alt22=3;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID:
                    case LETTER_X:
                    case MINUS:
                    case NOT:
                    case NUM:
                    case PLUS:
                    case STRING:
                    case TRUE:
                        {
                        alt22=1;
                        }
                        break;
                    case 89:
                        {
                        int LA22_2 = input.LA(2);

                        if ( (LA22_2==FALSE||LA22_2==ID||LA22_2==LETTER_X||LA22_2==MINUS||LA22_2==NOT||LA22_2==NUM||LA22_2==PLUS||LA22_2==STRING||LA22_2==TRUE||LA22_2==89) ) {
                            alt22=1;
                        }
                        else if ( (LA22_2==ARMOR||LA22_2==BEMOL||LA22_2==NOTE||LA22_2==SUSTAIN) ) {
                            alt22=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case DRUMS:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt22=2;
                        }
                        break;
                    case FIGURE:
                        {
                        alt22=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;

                    }

                    switch (alt22) {
                        case 1 :
                            // src/parser/Music.g:135:95: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig1628);
                            expr101=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr101.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:135:102: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig1632);
                            notes_variable102=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable102.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:135:119: FIGURE
                            {
                            FIGURE103=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_assig1636); 
                            FIGURE103_tree = 
                            (AmlTree)adaptor.create(FIGURE103)
                            ;
                            adaptor.addChild(root_0, FIGURE103_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:136:17: post
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_post_in_assig1655);
                    post104=post();

                    state._fsp--;

                    adaptor.addChild(root_0, post104.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:137:17: pre
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_pre_in_assig1673);
                    pre105=pre();

                    state._fsp--;

                    adaptor.addChild(root_0, pre105.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assig"


    public static class post_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "post"
    // src/parser/Music.g:140:1: post : var_access (x= INCR |x= DECR ) -> ^( POST var_access $x) ;
    public final MusicParser.post_return post() throws RecognitionException {
        MusicParser.post_return retval = new MusicParser.post_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        MusicParser.var_access_return var_access106 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleSubtreeStream stream_var_access=new RewriteRuleSubtreeStream(adaptor,"rule var_access");
        try {
            // src/parser/Music.g:140:13: ( var_access (x= INCR |x= DECR ) -> ^( POST var_access $x) )
            // src/parser/Music.g:140:17: var_access (x= INCR |x= DECR )
            {
            pushFollow(FOLLOW_var_access_in_post1703);
            var_access106=var_access();

            state._fsp--;

            stream_var_access.add(var_access106.getTree());

            // src/parser/Music.g:140:28: (x= INCR |x= DECR )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==INCR) ) {
                alt24=1;
            }
            else if ( (LA24_0==DECR) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // src/parser/Music.g:140:29: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_post1708);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:140:38: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_post1714);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            // AST REWRITE
            // elements: var_access, x
            // token labels: x
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_x=new RewriteRuleTokenStream(adaptor,"token x",x);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 140:46: -> ^( POST var_access $x)
            {
                // src/parser/Music.g:140:50: ^( POST var_access $x)
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(POST, "POST")
                , root_1);

                adaptor.addChild(root_1, stream_var_access.nextTree());

                adaptor.addChild(root_1, stream_x.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "post"


    public static class pre_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pre"
    // src/parser/Music.g:143:1: pre : (x= INCR |x= DECR ) var_access -> ^( PRE var_access $x) ;
    public final MusicParser.pre_return pre() throws RecognitionException {
        MusicParser.pre_return retval = new MusicParser.pre_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        MusicParser.var_access_return var_access107 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleSubtreeStream stream_var_access=new RewriteRuleSubtreeStream(adaptor,"rule var_access");
        try {
            // src/parser/Music.g:143:13: ( (x= INCR |x= DECR ) var_access -> ^( PRE var_access $x) )
            // src/parser/Music.g:143:17: (x= INCR |x= DECR ) var_access
            {
            // src/parser/Music.g:143:17: (x= INCR |x= DECR )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==INCR) ) {
                alt25=1;
            }
            else if ( (LA25_0==DECR) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // src/parser/Music.g:143:18: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_pre1761);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:143:27: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_pre1767);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            pushFollow(FOLLOW_var_access_in_pre1770);
            var_access107=var_access();

            state._fsp--;

            stream_var_access.add(var_access107.getTree());

            // AST REWRITE
            // elements: x, var_access
            // token labels: x
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_x=new RewriteRuleTokenStream(adaptor,"token x",x);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 143:47: -> ^( PRE var_access $x)
            {
                // src/parser/Music.g:143:50: ^( PRE var_access $x)
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(PRE, "PRE")
                , root_1);

                adaptor.addChild(root_1, stream_var_access.nextTree());

                adaptor.addChild(root_1, stream_x.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pre"


    public static class beat_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "beat"
    // src/parser/Music.g:146:1: beat : BEAT ^ NUM ':' ! NUM ;
    public final MusicParser.beat_return beat() throws RecognitionException {
        MusicParser.beat_return retval = new MusicParser.beat_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BEAT108=null;
        Token NUM109=null;
        Token char_literal110=null;
        Token NUM111=null;

        AmlTree BEAT108_tree=null;
        AmlTree NUM109_tree=null;
        AmlTree char_literal110_tree=null;
        AmlTree NUM111_tree=null;

        try {
            // src/parser/Music.g:146:13: ( BEAT ^ NUM ':' ! NUM )
            // src/parser/Music.g:146:17: BEAT ^ NUM ':' ! NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT108=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat1813); 
            BEAT108_tree = 
            (AmlTree)adaptor.create(BEAT108)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT108_tree, root_0);


            NUM109=(Token)match(input,NUM,FOLLOW_NUM_in_beat1816); 
            NUM109_tree = 
            (AmlTree)adaptor.create(NUM109)
            ;
            adaptor.addChild(root_0, NUM109_tree);


            char_literal110=(Token)match(input,93,FOLLOW_93_in_beat1818); 

            NUM111=(Token)match(input,NUM,FOLLOW_NUM_in_beat1821); 
            NUM111_tree = 
            (AmlTree)adaptor.create(NUM111)
            ;
            adaptor.addChild(root_0, NUM111_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "beat"


    public static class speed_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "speed"
    // src/parser/Music.g:149:1: speed : SPEED ^ NUM ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SPEED112=null;
        Token NUM113=null;

        AmlTree SPEED112_tree=null;
        AmlTree NUM113_tree=null;

        try {
            // src/parser/Music.g:149:13: ( SPEED ^ NUM )
            // src/parser/Music.g:149:17: SPEED ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED112=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed1850); 
            SPEED112_tree = 
            (AmlTree)adaptor.create(SPEED112)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED112_tree, root_0);


            NUM113=(Token)match(input,NUM,FOLLOW_NUM_in_speed1853); 
            NUM113_tree = 
            (AmlTree)adaptor.create(NUM113)
            ;
            adaptor.addChild(root_0, NUM113_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "speed"


    public static class transport_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "transport"
    // src/parser/Music.g:152:1: transport : TRANSPORT ^ expr ;
    public final MusicParser.transport_return transport() throws RecognitionException {
        MusicParser.transport_return retval = new MusicParser.transport_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRANSPORT114=null;
        MusicParser.expr_return expr115 =null;


        AmlTree TRANSPORT114_tree=null;

        try {
            // src/parser/Music.g:152:13: ( TRANSPORT ^ expr )
            // src/parser/Music.g:152:17: TRANSPORT ^ expr
            {
            root_0 = (AmlTree)adaptor.nil();


            TRANSPORT114=(Token)match(input,TRANSPORT,FOLLOW_TRANSPORT_in_transport1878); 
            TRANSPORT114_tree = 
            (AmlTree)adaptor.create(TRANSPORT114)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRANSPORT114_tree, root_0);


            pushFollow(FOLLOW_expr_in_transport1881);
            expr115=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr115.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "transport"


    public static class instrument_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instrument"
    // src/parser/Music.g:155:1: instrument : INSTRUMENT ^ STRING ';' ;
    public final MusicParser.instrument_return instrument() throws RecognitionException {
        MusicParser.instrument_return retval = new MusicParser.instrument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token INSTRUMENT116=null;
        Token STRING117=null;
        Token char_literal118=null;

        AmlTree INSTRUMENT116_tree=null;
        AmlTree STRING117_tree=null;
        AmlTree char_literal118_tree=null;

        try {
            // src/parser/Music.g:155:13: ( INSTRUMENT ^ STRING ';' )
            // src/parser/Music.g:155:17: INSTRUMENT ^ STRING ';'
            {
            root_0 = (AmlTree)adaptor.nil();


            INSTRUMENT116=(Token)match(input,INSTRUMENT,FOLLOW_INSTRUMENT_in_instrument1905); 
            INSTRUMENT116_tree = 
            (AmlTree)adaptor.create(INSTRUMENT116)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(INSTRUMENT116_tree, root_0);


            STRING117=(Token)match(input,STRING,FOLLOW_STRING_in_instrument1908); 
            STRING117_tree = 
            (AmlTree)adaptor.create(STRING117)
            ;
            adaptor.addChild(root_0, STRING117_tree);


            char_literal118=(Token)match(input,94,FOLLOW_94_in_instrument1910); 
            char_literal118_tree = 
            (AmlTree)adaptor.create(char_literal118)
            ;
            adaptor.addChild(root_0, char_literal118_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instrument"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // src/parser/Music.g:158:1: while_stmt : WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        Token char_literal123=null;
        Token char_literal125=null;
        MusicParser.expr_return expr121 =null;

        MusicParser.listInst_return listInst124 =null;


        AmlTree WHILE119_tree=null;
        AmlTree char_literal120_tree=null;
        AmlTree char_literal122_tree=null;
        AmlTree char_literal123_tree=null;
        AmlTree char_literal125_tree=null;

        try {
            // src/parser/Music.g:158:13: ( WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:158:17: WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE119=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1934); 
            WHILE119_tree = 
            (AmlTree)adaptor.create(WHILE119)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE119_tree, root_0);


            char_literal120=(Token)match(input,89,FOLLOW_89_in_while_stmt1937); 

            pushFollow(FOLLOW_expr_in_while_stmt1940);
            expr121=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr121.getTree());

            char_literal122=(Token)match(input,90,FOLLOW_90_in_while_stmt1942); 

            char_literal123=(Token)match(input,95,FOLLOW_95_in_while_stmt1945); 

            pushFollow(FOLLOW_listInst_in_while_stmt1948);
            listInst124=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst124.getTree());

            char_literal125=(Token)match(input,96,FOLLOW_96_in_while_stmt1950); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class while_music_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_music_stmt"
    // src/parser/Music.g:161:1: while_music_stmt : WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.while_music_stmt_return while_music_stmt() throws RecognitionException {
        MusicParser.while_music_stmt_return retval = new MusicParser.while_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE126=null;
        Token char_literal127=null;
        Token char_literal129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        MusicParser.expr_return expr128 =null;

        MusicParser.list_music_inst_return list_music_inst131 =null;


        AmlTree WHILE126_tree=null;
        AmlTree char_literal127_tree=null;
        AmlTree char_literal129_tree=null;
        AmlTree char_literal130_tree=null;
        AmlTree char_literal132_tree=null;

        try {
            // src/parser/Music.g:161:21: ( WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:161:25: WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE126=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_music_stmt1977); 
            WHILE126_tree = 
            (AmlTree)adaptor.create(WHILE126)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE126_tree, root_0);


            char_literal127=(Token)match(input,89,FOLLOW_89_in_while_music_stmt1980); 

            pushFollow(FOLLOW_expr_in_while_music_stmt1983);
            expr128=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr128.getTree());

            char_literal129=(Token)match(input,90,FOLLOW_90_in_while_music_stmt1985); 

            char_literal130=(Token)match(input,95,FOLLOW_95_in_while_music_stmt1988); 

            pushFollow(FOLLOW_list_music_inst_in_while_music_stmt1991);
            list_music_inst131=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst131.getTree());

            char_literal132=(Token)match(input,96,FOLLOW_96_in_while_music_stmt1993); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_music_stmt"


    public static class for_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_stmt"
    // src/parser/Music.g:164:1: for_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR133=null;
        Token char_literal134=null;
        Token char_literal137=null;
        Token char_literal139=null;
        Token char_literal141=null;
        Token char_literal142=null;
        Token char_literal144=null;
        MusicParser.declaration_return declaration135 =null;

        MusicParser.list_assig_return list_assig136 =null;

        MusicParser.expr_return expr138 =null;

        MusicParser.list_assig_return list_assig140 =null;

        MusicParser.listInst_return listInst143 =null;


        AmlTree FOR133_tree=null;
        AmlTree char_literal134_tree=null;
        AmlTree char_literal137_tree=null;
        AmlTree char_literal139_tree=null;
        AmlTree char_literal141_tree=null;
        AmlTree char_literal142_tree=null;
        AmlTree char_literal144_tree=null;

        try {
            // src/parser/Music.g:164:13: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:164:17: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR133=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt2028); 
            FOR133_tree = 
            (AmlTree)adaptor.create(FOR133)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR133_tree, root_0);


            char_literal134=(Token)match(input,89,FOLLOW_89_in_for_stmt2031); 

            // src/parser/Music.g:164:27: ( declaration | list_assig ';' !)
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==BOOL||LA26_0==CHORD||LA26_0==DRUMS_NOTE_TYPE||LA26_0==INT||LA26_0==NOTE_TYPE||LA26_0==STRING_TYPE) ) {
                alt26=1;
            }
            else if ( (LA26_0==DECR||LA26_0==ID||LA26_0==INCR||LA26_0==LETTER_X) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // src/parser/Music.g:164:28: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_stmt2035);
                    declaration135=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration135.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:164:42: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_stmt2039);
                    list_assig136=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig136.getTree());

                    char_literal137=(Token)match(input,94,FOLLOW_94_in_for_stmt2041); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_stmt2045);
            expr138=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr138.getTree());

            char_literal139=(Token)match(input,94,FOLLOW_94_in_for_stmt2047); 

            pushFollow(FOLLOW_list_assig_in_for_stmt2050);
            list_assig140=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig140.getTree());

            char_literal141=(Token)match(input,90,FOLLOW_90_in_for_stmt2052); 

            char_literal142=(Token)match(input,95,FOLLOW_95_in_for_stmt2055); 

            pushFollow(FOLLOW_listInst_in_for_stmt2058);
            listInst143=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst143.getTree());

            char_literal144=(Token)match(input,96,FOLLOW_96_in_for_stmt2060); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_stmt"


    public static class for_music_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_music_stmt"
    // src/parser/Music.g:167:1: for_music_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.for_music_stmt_return for_music_stmt() throws RecognitionException {
        MusicParser.for_music_stmt_return retval = new MusicParser.for_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR145=null;
        Token char_literal146=null;
        Token char_literal149=null;
        Token char_literal151=null;
        Token char_literal153=null;
        Token char_literal154=null;
        Token char_literal156=null;
        MusicParser.declaration_return declaration147 =null;

        MusicParser.list_assig_return list_assig148 =null;

        MusicParser.expr_return expr150 =null;

        MusicParser.list_assig_return list_assig152 =null;

        MusicParser.list_music_inst_return list_music_inst155 =null;


        AmlTree FOR145_tree=null;
        AmlTree char_literal146_tree=null;
        AmlTree char_literal149_tree=null;
        AmlTree char_literal151_tree=null;
        AmlTree char_literal153_tree=null;
        AmlTree char_literal154_tree=null;
        AmlTree char_literal156_tree=null;

        try {
            // src/parser/Music.g:167:17: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:167:21: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR145=(Token)match(input,FOR,FOLLOW_FOR_in_for_music_stmt2085); 
            FOR145_tree = 
            (AmlTree)adaptor.create(FOR145)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR145_tree, root_0);


            char_literal146=(Token)match(input,89,FOLLOW_89_in_for_music_stmt2088); 

            // src/parser/Music.g:167:31: ( declaration | list_assig ';' !)
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==BOOL||LA27_0==CHORD||LA27_0==DRUMS_NOTE_TYPE||LA27_0==INT||LA27_0==NOTE_TYPE||LA27_0==STRING_TYPE) ) {
                alt27=1;
            }
            else if ( (LA27_0==DECR||LA27_0==ID||LA27_0==INCR||LA27_0==LETTER_X) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // src/parser/Music.g:167:32: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_music_stmt2092);
                    declaration147=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration147.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:167:46: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_music_stmt2096);
                    list_assig148=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig148.getTree());

                    char_literal149=(Token)match(input,94,FOLLOW_94_in_for_music_stmt2098); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_music_stmt2102);
            expr150=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr150.getTree());

            char_literal151=(Token)match(input,94,FOLLOW_94_in_for_music_stmt2104); 

            pushFollow(FOLLOW_list_assig_in_for_music_stmt2107);
            list_assig152=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig152.getTree());

            char_literal153=(Token)match(input,90,FOLLOW_90_in_for_music_stmt2109); 

            char_literal154=(Token)match(input,95,FOLLOW_95_in_for_music_stmt2112); 

            pushFollow(FOLLOW_list_music_inst_in_for_music_stmt2115);
            list_music_inst155=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst155.getTree());

            char_literal156=(Token)match(input,96,FOLLOW_96_in_for_music_stmt2117); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_music_stmt"


    public static class list_assig_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_assig"
    // src/parser/Music.g:170:1: list_assig : assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) ;
    public final MusicParser.list_assig_return list_assig() throws RecognitionException {
        MusicParser.list_assig_return retval = new MusicParser.list_assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal158=null;
        MusicParser.assig_return assig157 =null;

        MusicParser.assig_return assig159 =null;


        AmlTree char_literal158_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_assig=new RewriteRuleSubtreeStream(adaptor,"rule assig");
        try {
            // src/parser/Music.g:170:13: ( assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) )
            // src/parser/Music.g:170:17: assig ( ',' assig )*
            {
            pushFollow(FOLLOW_assig_in_list_assig2146);
            assig157=assig();

            state._fsp--;

            stream_assig.add(assig157.getTree());

            // src/parser/Music.g:170:23: ( ',' assig )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==91) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // src/parser/Music.g:170:24: ',' assig
            	    {
            	    char_literal158=(Token)match(input,91,FOLLOW_91_in_list_assig2149);  
            	    stream_91.add(char_literal158);


            	    pushFollow(FOLLOW_assig_in_list_assig2151);
            	    assig159=assig();

            	    state._fsp--;

            	    stream_assig.add(assig159.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // AST REWRITE
            // elements: assig
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 170:36: -> ^( LIST_ASSIG ( assig )+ )
            {
                // src/parser/Music.g:170:39: ^( LIST_ASSIG ( assig )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_ASSIG, "LIST_ASSIG")
                , root_1);

                if ( !(stream_assig.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_assig.hasNext() ) {
                    adaptor.addChild(root_1, stream_assig.nextTree());

                }
                stream_assig.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_assig"


    public static class if_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_stmt"
    // src/parser/Music.g:173:1: if_stmt : IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? ;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF160=null;
        Token char_literal161=null;
        Token char_literal163=null;
        Token char_literal164=null;
        Token char_literal166=null;
        MusicParser.expr_return expr162 =null;

        MusicParser.listInst_return listInst165 =null;

        MusicParser.elseif_stmt_return elseif_stmt167 =null;

        MusicParser.else_stmt_return else_stmt168 =null;


        AmlTree IF160_tree=null;
        AmlTree char_literal161_tree=null;
        AmlTree char_literal163_tree=null;
        AmlTree char_literal164_tree=null;
        AmlTree char_literal166_tree=null;

        try {
            // src/parser/Music.g:173:13: ( IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? )
            // src/parser/Music.g:173:17: IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF160=(Token)match(input,IF,FOLLOW_IF_in_if_stmt2189); 
            IF160_tree = 
            (AmlTree)adaptor.create(IF160)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF160_tree, root_0);


            char_literal161=(Token)match(input,89,FOLLOW_89_in_if_stmt2192); 

            pushFollow(FOLLOW_expr_in_if_stmt2195);
            expr162=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr162.getTree());

            char_literal163=(Token)match(input,90,FOLLOW_90_in_if_stmt2197); 

            char_literal164=(Token)match(input,95,FOLLOW_95_in_if_stmt2200); 

            pushFollow(FOLLOW_listInst_in_if_stmt2203);
            listInst165=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst165.getTree());

            char_literal166=(Token)match(input,96,FOLLOW_96_in_if_stmt2205); 

            // src/parser/Music.g:173:55: ( elseif_stmt )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ELSE) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==IF) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // src/parser/Music.g:173:55: elseif_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_stmt_in_if_stmt2208);
            	    elseif_stmt167=elseif_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_stmt167.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            // src/parser/Music.g:173:68: ( else_stmt )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ELSE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // src/parser/Music.g:173:68: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_if_stmt2211);
                    else_stmt168=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt168.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_stmt"


    public static class elseif_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseif_stmt"
    // src/parser/Music.g:176:1: elseif_stmt : ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) ;
    public final MusicParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        MusicParser.elseif_stmt_return retval = new MusicParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE169=null;
        Token IF170=null;
        Token char_literal171=null;
        Token char_literal173=null;
        Token char_literal174=null;
        Token char_literal176=null;
        MusicParser.expr_return expr172 =null;

        MusicParser.listInst_return listInst175 =null;


        AmlTree ELSE169_tree=null;
        AmlTree IF170_tree=null;
        AmlTree char_literal171_tree=null;
        AmlTree char_literal173_tree=null;
        AmlTree char_literal174_tree=null;
        AmlTree char_literal176_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:176:13: ( ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) )
            // src/parser/Music.g:176:17: ELSE IF '(' expr ')' '{' listInst '}'
            {
            ELSE169=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_stmt2235);  
            stream_ELSE.add(ELSE169);


            IF170=(Token)match(input,IF,FOLLOW_IF_in_elseif_stmt2237);  
            stream_IF.add(IF170);


            char_literal171=(Token)match(input,89,FOLLOW_89_in_elseif_stmt2239);  
            stream_89.add(char_literal171);


            pushFollow(FOLLOW_expr_in_elseif_stmt2241);
            expr172=expr();

            state._fsp--;

            stream_expr.add(expr172.getTree());

            char_literal173=(Token)match(input,90,FOLLOW_90_in_elseif_stmt2243);  
            stream_90.add(char_literal173);


            char_literal174=(Token)match(input,95,FOLLOW_95_in_elseif_stmt2245);  
            stream_95.add(char_literal174);


            pushFollow(FOLLOW_listInst_in_elseif_stmt2247);
            listInst175=listInst();

            state._fsp--;

            stream_listInst.add(listInst175.getTree());

            char_literal176=(Token)match(input,96,FOLLOW_96_in_elseif_stmt2249);  
            stream_96.add(char_literal176);


            // AST REWRITE
            // elements: expr, listInst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 176:55: -> ^( ELSEIF expr listInst )
            {
                // src/parser/Music.g:176:58: ^( ELSEIF expr listInst )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(ELSEIF, "ELSEIF")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_listInst.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elseif_stmt"


    public static class else_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_stmt"
    // src/parser/Music.g:179:1: else_stmt : ELSE ^ '{' ! listInst '}' !;
    public final MusicParser.else_stmt_return else_stmt() throws RecognitionException {
        MusicParser.else_stmt_return retval = new MusicParser.else_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE177=null;
        Token char_literal178=null;
        Token char_literal180=null;
        MusicParser.listInst_return listInst179 =null;


        AmlTree ELSE177_tree=null;
        AmlTree char_literal178_tree=null;
        AmlTree char_literal180_tree=null;

        try {
            // src/parser/Music.g:179:13: ( ELSE ^ '{' ! listInst '}' !)
            // src/parser/Music.g:179:17: ELSE ^ '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE177=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt2284); 
            ELSE177_tree = 
            (AmlTree)adaptor.create(ELSE177)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE177_tree, root_0);


            char_literal178=(Token)match(input,95,FOLLOW_95_in_else_stmt2287); 

            pushFollow(FOLLOW_listInst_in_else_stmt2290);
            listInst179=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst179.getTree());

            char_literal180=(Token)match(input,96,FOLLOW_96_in_else_stmt2292); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_stmt"


    public static class if_music_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_music_stmt"
    // src/parser/Music.g:182:1: if_music_stmt : IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? ;
    public final MusicParser.if_music_stmt_return if_music_stmt() throws RecognitionException {
        MusicParser.if_music_stmt_return retval = new MusicParser.if_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF181=null;
        Token char_literal182=null;
        Token char_literal184=null;
        Token char_literal185=null;
        Token char_literal187=null;
        MusicParser.expr_return expr183 =null;

        MusicParser.list_music_inst_return list_music_inst186 =null;

        MusicParser.elseif_music_stmt_return elseif_music_stmt188 =null;

        MusicParser.else_music_stmt_return else_music_stmt189 =null;


        AmlTree IF181_tree=null;
        AmlTree char_literal182_tree=null;
        AmlTree char_literal184_tree=null;
        AmlTree char_literal185_tree=null;
        AmlTree char_literal187_tree=null;

        try {
            // src/parser/Music.g:182:17: ( IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? )
            // src/parser/Music.g:182:21: IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF181=(Token)match(input,IF,FOLLOW_IF_in_if_music_stmt2318); 
            IF181_tree = 
            (AmlTree)adaptor.create(IF181)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF181_tree, root_0);


            char_literal182=(Token)match(input,89,FOLLOW_89_in_if_music_stmt2321); 

            pushFollow(FOLLOW_expr_in_if_music_stmt2324);
            expr183=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr183.getTree());

            char_literal184=(Token)match(input,90,FOLLOW_90_in_if_music_stmt2326); 

            char_literal185=(Token)match(input,95,FOLLOW_95_in_if_music_stmt2329); 

            pushFollow(FOLLOW_list_music_inst_in_if_music_stmt2332);
            list_music_inst186=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst186.getTree());

            char_literal187=(Token)match(input,96,FOLLOW_96_in_if_music_stmt2334); 

            // src/parser/Music.g:182:66: ( elseif_music_stmt )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==ELSE) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==IF) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // src/parser/Music.g:182:66: elseif_music_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_music_stmt_in_if_music_stmt2337);
            	    elseif_music_stmt188=elseif_music_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_music_stmt188.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            // src/parser/Music.g:182:85: ( else_music_stmt )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ELSE) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // src/parser/Music.g:182:85: else_music_stmt
                    {
                    pushFollow(FOLLOW_else_music_stmt_in_if_music_stmt2340);
                    else_music_stmt189=else_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_music_stmt189.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_music_stmt"


    public static class elseif_music_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseif_music_stmt"
    // src/parser/Music.g:185:1: elseif_music_stmt : ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) ;
    public final MusicParser.elseif_music_stmt_return elseif_music_stmt() throws RecognitionException {
        MusicParser.elseif_music_stmt_return retval = new MusicParser.elseif_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE190=null;
        Token IF191=null;
        Token char_literal192=null;
        Token char_literal194=null;
        Token char_literal195=null;
        Token char_literal197=null;
        MusicParser.expr_return expr193 =null;

        MusicParser.list_music_inst_return list_music_inst196 =null;


        AmlTree ELSE190_tree=null;
        AmlTree IF191_tree=null;
        AmlTree char_literal192_tree=null;
        AmlTree char_literal194_tree=null;
        AmlTree char_literal195_tree=null;
        AmlTree char_literal197_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_list_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule list_music_inst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:185:21: ( ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) )
            // src/parser/Music.g:185:25: ELSE IF '(' expr ')' '{' list_music_inst '}'
            {
            ELSE190=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_music_stmt2370);  
            stream_ELSE.add(ELSE190);


            IF191=(Token)match(input,IF,FOLLOW_IF_in_elseif_music_stmt2372);  
            stream_IF.add(IF191);


            char_literal192=(Token)match(input,89,FOLLOW_89_in_elseif_music_stmt2374);  
            stream_89.add(char_literal192);


            pushFollow(FOLLOW_expr_in_elseif_music_stmt2376);
            expr193=expr();

            state._fsp--;

            stream_expr.add(expr193.getTree());

            char_literal194=(Token)match(input,90,FOLLOW_90_in_elseif_music_stmt2378);  
            stream_90.add(char_literal194);


            char_literal195=(Token)match(input,95,FOLLOW_95_in_elseif_music_stmt2380);  
            stream_95.add(char_literal195);


            pushFollow(FOLLOW_list_music_inst_in_elseif_music_stmt2382);
            list_music_inst196=list_music_inst();

            state._fsp--;

            stream_list_music_inst.add(list_music_inst196.getTree());

            char_literal197=(Token)match(input,96,FOLLOW_96_in_elseif_music_stmt2384);  
            stream_96.add(char_literal197);


            // AST REWRITE
            // elements: list_music_inst, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 185:70: -> ^( ELSEIF expr list_music_inst )
            {
                // src/parser/Music.g:185:73: ^( ELSEIF expr list_music_inst )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(ELSEIF, "ELSEIF")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_list_music_inst.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elseif_music_stmt"


    public static class else_music_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_music_stmt"
    // src/parser/Music.g:188:1: else_music_stmt : ELSE ^ '{' ! list_music_inst '}' !;
    public final MusicParser.else_music_stmt_return else_music_stmt() throws RecognitionException {
        MusicParser.else_music_stmt_return retval = new MusicParser.else_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE198=null;
        Token char_literal199=null;
        Token char_literal201=null;
        MusicParser.list_music_inst_return list_music_inst200 =null;


        AmlTree ELSE198_tree=null;
        AmlTree char_literal199_tree=null;
        AmlTree char_literal201_tree=null;

        try {
            // src/parser/Music.g:188:17: ( ELSE ^ '{' ! list_music_inst '}' !)
            // src/parser/Music.g:188:21: ELSE ^ '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE198=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_music_stmt2425); 
            ELSE198_tree = 
            (AmlTree)adaptor.create(ELSE198)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE198_tree, root_0);


            char_literal199=(Token)match(input,95,FOLLOW_95_in_else_music_stmt2428); 

            pushFollow(FOLLOW_list_music_inst_in_else_music_stmt2431);
            list_music_inst200=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst200.getTree());

            char_literal201=(Token)match(input,96,FOLLOW_96_in_else_music_stmt2433); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_music_stmt"


    public static class song_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "song"
    // src/parser/Music.g:191:1: song : SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )+ ( drums_track )? '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG202=null;
        Token char_literal204=null;
        Token char_literal206=null;
        Token char_literal208=null;
        Token char_literal210=null;
        Token char_literal212=null;
        Token char_literal215=null;
        MusicParser.id_rule_return id_rule203 =null;

        MusicParser.beat_return beat205 =null;

        MusicParser.speed_return speed207 =null;

        MusicParser.tone_return tone209 =null;

        MusicParser.transport_return transport211 =null;

        MusicParser.track_return track213 =null;

        MusicParser.drums_track_return drums_track214 =null;


        AmlTree SONG202_tree=null;
        AmlTree char_literal204_tree=null;
        AmlTree char_literal206_tree=null;
        AmlTree char_literal208_tree=null;
        AmlTree char_literal210_tree=null;
        AmlTree char_literal212_tree=null;
        AmlTree char_literal215_tree=null;

        try {
            // src/parser/Music.g:191:13: ( SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )+ ( drums_track )? '}' !)
            // src/parser/Music.g:191:17: SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )+ ( drums_track )? '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG202=(Token)match(input,SONG,FOLLOW_SONG_in_song2468); 
            SONG202_tree = 
            (AmlTree)adaptor.create(SONG202)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG202_tree, root_0);


            // src/parser/Music.g:191:23: ( id_rule )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ID||LA33_0==LETTER_X) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // src/parser/Music.g:191:23: id_rule
                    {
                    pushFollow(FOLLOW_id_rule_in_song2471);
                    id_rule203=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule203.getTree());

                    }
                    break;

            }


            char_literal204=(Token)match(input,95,FOLLOW_95_in_song2474); 

            // src/parser/Music.g:191:37: ( beat ';' !)?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==BEAT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // src/parser/Music.g:191:38: beat ';' !
                    {
                    pushFollow(FOLLOW_beat_in_song2478);
                    beat205=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat205.getTree());

                    char_literal206=(Token)match(input,94,FOLLOW_94_in_song2480); 

                    }
                    break;

            }


            // src/parser/Music.g:191:50: ( speed ';' !)?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==SPEED) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // src/parser/Music.g:191:51: speed ';' !
                    {
                    pushFollow(FOLLOW_speed_in_song2486);
                    speed207=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed207.getTree());

                    char_literal208=(Token)match(input,94,FOLLOW_94_in_song2488); 

                    }
                    break;

            }


            // src/parser/Music.g:191:64: ( tone ';' !)?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==TONE) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/parser/Music.g:191:65: tone ';' !
                    {
                    pushFollow(FOLLOW_tone_in_song2494);
                    tone209=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone209.getTree());

                    char_literal210=(Token)match(input,94,FOLLOW_94_in_song2496); 

                    }
                    break;

            }


            // src/parser/Music.g:191:77: ( transport ';' !)?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==TRANSPORT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // src/parser/Music.g:191:78: transport ';' !
                    {
                    pushFollow(FOLLOW_transport_in_song2502);
                    transport211=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport211.getTree());

                    char_literal212=(Token)match(input,94,FOLLOW_94_in_song2504); 

                    }
                    break;

            }


            // src/parser/Music.g:191:96: ( track )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==TRACK) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // src/parser/Music.g:191:97: track
            	    {
            	    pushFollow(FOLLOW_track_in_song2511);
            	    track213=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track213.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            // src/parser/Music.g:191:105: ( drums_track )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==DRUMS) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/parser/Music.g:191:105: drums_track
                    {
                    pushFollow(FOLLOW_drums_track_in_song2515);
                    drums_track214=drums_track();

                    state._fsp--;

                    adaptor.addChild(root_0, drums_track214.getTree());

                    }
                    break;

            }


            char_literal215=(Token)match(input,96,FOLLOW_96_in_song2518); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "song"


    public static class track_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "track"
    // src/parser/Music.g:194:1: track : TRACK ^ ( id_rule )? ( STRING )? compas_aux ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK216=null;
        Token STRING218=null;
        MusicParser.id_rule_return id_rule217 =null;

        MusicParser.compas_aux_return compas_aux219 =null;


        AmlTree TRACK216_tree=null;
        AmlTree STRING218_tree=null;

        try {
            // src/parser/Music.g:194:13: ( TRACK ^ ( id_rule )? ( STRING )? compas_aux )
            // src/parser/Music.g:194:17: TRACK ^ ( id_rule )? ( STRING )? compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK216=(Token)match(input,TRACK,FOLLOW_TRACK_in_track2548); 
            TRACK216_tree = 
            (AmlTree)adaptor.create(TRACK216)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK216_tree, root_0);


            // src/parser/Music.g:194:24: ( id_rule )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ID||LA40_0==LETTER_X) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // src/parser/Music.g:194:24: id_rule
                    {
                    pushFollow(FOLLOW_id_rule_in_track2551);
                    id_rule217=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule217.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:194:33: ( STRING )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==STRING) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // src/parser/Music.g:194:33: STRING
                    {
                    STRING218=(Token)match(input,STRING,FOLLOW_STRING_in_track2554); 
                    STRING218_tree = 
                    (AmlTree)adaptor.create(STRING218)
                    ;
                    adaptor.addChild(root_0, STRING218_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_compas_aux_in_track2557);
            compas_aux219=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux219.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "track"


    public static class drums_track_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drums_track"
    // src/parser/Music.g:197:1: drums_track : DRUMS ^ TRACK compas_aux ;
    public final MusicParser.drums_track_return drums_track() throws RecognitionException {
        MusicParser.drums_track_return retval = new MusicParser.drums_track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DRUMS220=null;
        Token TRACK221=null;
        MusicParser.compas_aux_return compas_aux222 =null;


        AmlTree DRUMS220_tree=null;
        AmlTree TRACK221_tree=null;

        try {
            // src/parser/Music.g:197:13: ( DRUMS ^ TRACK compas_aux )
            // src/parser/Music.g:197:17: DRUMS ^ TRACK compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            DRUMS220=(Token)match(input,DRUMS,FOLLOW_DRUMS_in_drums_track2592); 
            DRUMS220_tree = 
            (AmlTree)adaptor.create(DRUMS220)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(DRUMS220_tree, root_0);


            TRACK221=(Token)match(input,TRACK,FOLLOW_TRACK_in_drums_track2595); 
            TRACK221_tree = 
            (AmlTree)adaptor.create(TRACK221)
            ;
            adaptor.addChild(root_0, TRACK221_tree);


            pushFollow(FOLLOW_compas_aux_in_drums_track2597);
            compas_aux222=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux222.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drums_track"


    public static class compas_aux_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas_aux"
    // src/parser/Music.g:200:1: compas_aux : compas_list -> ^( COMPAS_LIST compas_list ) ;
    public final MusicParser.compas_aux_return compas_aux() throws RecognitionException {
        MusicParser.compas_aux_return retval = new MusicParser.compas_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_list_return compas_list223 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:200:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:200:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux2621);
            compas_list223=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list223.getTree());

            // AST REWRITE
            // elements: compas_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 200:29: -> ^( COMPAS_LIST compas_list )
            {
                // src/parser/Music.g:200:32: ^( COMPAS_LIST compas_list )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS_LIST, "COMPAS_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_compas_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compas_aux"


    public static class compas_list_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas_list"
    // src/parser/Music.g:203:1: compas_list : ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR224=null;
        Token DOUBLE_BAR228=null;
        MusicParser.repetition_return repetition225 =null;

        MusicParser.compasses_return compasses226 =null;

        MusicParser.repetition_return repetition227 =null;


        AmlTree DOUBLE_BAR224_tree=null;
        AmlTree DOUBLE_BAR228_tree=null;

        try {
            // src/parser/Music.g:203:13: ( ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) )
            // src/parser/Music.g:203:15: ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !)
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:203:15: ( DOUBLE_BAR !| repetition )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==DOUBLE_BAR) ) {
                alt42=1;
            }
            else if ( (LA42_0==NUM||LA42_0==START_REPETITION) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // src/parser/Music.g:203:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR224=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2651); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:203:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list2656);
                    repetition225=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition225.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:203:42: ( compasses | repetition )*
            loop43:
            do {
                int alt43=3;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==ARMOR||(LA43_0 >= BEAT && LA43_0 <= BOOL)||LA43_0==CHORD||LA43_0==DECR||(LA43_0 >= DRUMS && LA43_0 <= DRUMS_NOTE_TYPE)||LA43_0==FOR||(LA43_0 >= ID && LA43_0 <= INT)||LA43_0==LETTER_X||LA43_0==NOTE||LA43_0==NOTE_TYPE||(LA43_0 >= SONG && LA43_0 <= SPEED)||(LA43_0 >= STRING_TYPE && LA43_0 <= SUSTAIN)||LA43_0==TONE||LA43_0==WHILE||LA43_0==89) ) {
                    alt43=1;
                }
                else if ( (LA43_0==NUM||LA43_0==START_REPETITION) ) {
                    alt43=2;
                }


                switch (alt43) {
            	case 1 :
            	    // src/parser/Music.g:203:43: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_list2660);
            	    compasses226=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses226.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:203:55: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_list2664);
            	    repetition227=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition227.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            // src/parser/Music.g:203:68: ( DOUBLE_BAR !)
            // src/parser/Music.g:203:69: DOUBLE_BAR !
            {
            DOUBLE_BAR228=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2669); 

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compas_list"


    public static class compasses_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compasses"
    // src/parser/Music.g:206:1: compasses : compas ( BAR ! compas )* ;
    public final MusicParser.compasses_return compasses() throws RecognitionException {
        MusicParser.compasses_return retval = new MusicParser.compasses_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BAR230=null;
        MusicParser.compas_return compas229 =null;

        MusicParser.compas_return compas231 =null;


        AmlTree BAR230_tree=null;

        try {
            // src/parser/Music.g:206:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:206:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses2696);
            compas229=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas229.getTree());

            // src/parser/Music.g:206:24: ( BAR ! compas )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==BAR) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // src/parser/Music.g:206:25: BAR ! compas
            	    {
            	    BAR230=(Token)match(input,BAR,FOLLOW_BAR_in_compasses2699); 

            	    pushFollow(FOLLOW_compas_in_compasses2702);
            	    compas231=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas231.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compasses"


    public static class repetition_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repetition"
    // src/parser/Music.g:209:1: repetition : ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION -> ^( REPETITION ( NUM )? compasses ) ;
    public final MusicParser.repetition_return repetition() throws RecognitionException {
        MusicParser.repetition_return retval = new MusicParser.repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NUM232=null;
        Token LETTER_X233=null;
        Token START_REPETITION234=null;
        Token END_REPETITION236=null;
        MusicParser.compasses_return compasses235 =null;


        AmlTree NUM232_tree=null;
        AmlTree LETTER_X233_tree=null;
        AmlTree START_REPETITION234_tree=null;
        AmlTree END_REPETITION236_tree=null;
        RewriteRuleTokenStream stream_LETTER_X=new RewriteRuleTokenStream(adaptor,"token LETTER_X");
        RewriteRuleTokenStream stream_END_REPETITION=new RewriteRuleTokenStream(adaptor,"token END_REPETITION");
        RewriteRuleTokenStream stream_START_REPETITION=new RewriteRuleTokenStream(adaptor,"token START_REPETITION");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleSubtreeStream stream_compasses=new RewriteRuleSubtreeStream(adaptor,"rule compasses");
        try {
            // src/parser/Music.g:209:13: ( ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION -> ^( REPETITION ( NUM )? compasses ) )
            // src/parser/Music.g:209:17: ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION
            {
            // src/parser/Music.g:209:17: ( NUM LETTER_X )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==NUM) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // src/parser/Music.g:209:18: NUM LETTER_X
                    {
                    NUM232=(Token)match(input,NUM,FOLLOW_NUM_in_repetition2729);  
                    stream_NUM.add(NUM232);


                    LETTER_X233=(Token)match(input,LETTER_X,FOLLOW_LETTER_X_in_repetition2731);  
                    stream_LETTER_X.add(LETTER_X233);


                    }
                    break;

            }


            START_REPETITION234=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition2735);  
            stream_START_REPETITION.add(START_REPETITION234);


            pushFollow(FOLLOW_compasses_in_repetition2737);
            compasses235=compasses();

            state._fsp--;

            stream_compasses.add(compasses235.getTree());

            END_REPETITION236=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition2739);  
            stream_END_REPETITION.add(END_REPETITION236);


            // AST REWRITE
            // elements: compasses, NUM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 209:78: -> ^( REPETITION ( NUM )? compasses )
            {
                // src/parser/Music.g:209:81: ^( REPETITION ( NUM )? compasses )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(REPETITION, "REPETITION")
                , root_1);

                // src/parser/Music.g:209:94: ( NUM )?
                if ( stream_NUM.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_NUM.nextNode()
                    );

                }
                stream_NUM.reset();

                adaptor.addChild(root_1, stream_compasses.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "repetition"


    public static class compas_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas"
    // src/parser/Music.g:212:1: compas : ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( music_inst )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst237 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:212:13: ( ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( music_inst )+ ) )
            // src/parser/Music.g:212:16: ( options {greedy=true; } : music_inst )+
            {
            // src/parser/Music.g:212:16: ( options {greedy=true; } : music_inst )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                switch ( input.LA(1) ) {
                case CHORD:
                    {
                    alt46=1;
                    }
                    break;
                case TONE:
                    {
                    alt46=1;
                    }
                    break;
                case BEAT:
                    {
                    alt46=1;
                    }
                    break;
                case SPEED:
                    {
                    alt46=1;
                    }
                    break;
                case INSTRUMENT:
                    {
                    alt46=1;
                    }
                    break;
                case ID:
                case LETTER_X:
                    {
                    alt46=1;
                    }
                    break;
                case INCR:
                    {
                    alt46=1;
                    }
                    break;
                case DECR:
                    {
                    alt46=1;
                    }
                    break;
                case WHILE:
                    {
                    alt46=1;
                    }
                    break;
                case FOR:
                    {
                    alt46=1;
                    }
                    break;
                case IF:
                    {
                    alt46=1;
                    }
                    break;
                case SONG:
                    {
                    alt46=1;
                    }
                    break;
                case BOOL:
                case DRUMS_NOTE_TYPE:
                case INT:
                case NOTE_TYPE:
                case STRING_TYPE:
                    {
                    alt46=1;
                    }
                    break;
                case 89:
                    {
                    alt46=1;
                    }
                    break;
                case ARMOR:
                case BEMOL:
                case SUSTAIN:
                    {
                    alt46=1;
                    }
                    break;
                case NOTE:
                    {
                    alt46=1;
                    }
                    break;
                case DRUMS:
                    {
                    alt46=1;
                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // src/parser/Music.g:212:42: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_compas2790);
            	    music_inst237=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst237.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            // AST REWRITE
            // elements: music_inst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 212:58: -> ^( COMPAS ( music_inst )+ )
            {
                // src/parser/Music.g:212:61: ^( COMPAS ( music_inst )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS, "COMPAS")
                , root_1);

                if ( !(stream_music_inst.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_music_inst.hasNext() ) {
                    adaptor.addChild(root_1, stream_music_inst.nextTree());

                }
                stream_music_inst.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compas"


    public static class tone_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tone"
    // src/parser/Music.g:215:1: tone : TONE ^ NUM ( SUSTAIN | BEMOL ) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TONE238=null;
        Token NUM239=null;
        Token set240=null;

        AmlTree TONE238_tree=null;
        AmlTree NUM239_tree=null;
        AmlTree set240_tree=null;

        try {
            // src/parser/Music.g:215:13: ( TONE ^ NUM ( SUSTAIN | BEMOL ) )
            // src/parser/Music.g:215:17: TONE ^ NUM ( SUSTAIN | BEMOL )
            {
            root_0 = (AmlTree)adaptor.nil();


            TONE238=(Token)match(input,TONE,FOLLOW_TONE_in_tone2834); 
            TONE238_tree = 
            (AmlTree)adaptor.create(TONE238)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TONE238_tree, root_0);


            NUM239=(Token)match(input,NUM,FOLLOW_NUM_in_tone2837); 
            NUM239_tree = 
            (AmlTree)adaptor.create(NUM239)
            ;
            adaptor.addChild(root_0, NUM239_tree);


            set240=(Token)input.LT(1);

            if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set240)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tone"


    public static class notes_group_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes_group"
    // src/parser/Music.g:218:1: notes_group : notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal242=null;
        Token FIGURE243=null;
        Token DOT244=null;
        Token TIE245=null;
        MusicParser.notes_type_return notes_type241 =null;


        AmlTree char_literal242_tree=null;
        AmlTree FIGURE243_tree=null;
        AmlTree DOT244_tree=null;
        AmlTree TIE245_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:218:13: ( notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:218:17: notes_type ( '.' FIGURE ( DOT )? )? ( TIE )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_group2868);
            notes_type241=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type241.getTree());

            // src/parser/Music.g:218:28: ( '.' FIGURE ( DOT )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==92) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // src/parser/Music.g:218:29: '.' FIGURE ( DOT )?
                    {
                    char_literal242=(Token)match(input,92,FOLLOW_92_in_notes_group2871);  
                    stream_92.add(char_literal242);


                    FIGURE243=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_group2873);  
                    stream_FIGURE.add(FIGURE243);


                    // src/parser/Music.g:218:40: ( DOT )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==DOT) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // src/parser/Music.g:218:40: DOT
                            {
                            DOT244=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group2875);  
                            stream_DOT.add(DOT244);


                            }
                            break;

                    }


                    }
                    break;

            }


            // src/parser/Music.g:218:47: ( TIE )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==TIE) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // src/parser/Music.g:218:47: TIE
                    {
                    TIE245=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group2880);  
                    stream_TIE.add(TIE245);


                    }
                    break;

            }


            // AST REWRITE
            // elements: notes_type, DOT, TIE, FIGURE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 218:52: -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:218:55: ^( NOTES notes_type ( FIGURE )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTES, "NOTES")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:218:74: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:218:82: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:218:87: ( TIE )?
                if ( stream_TIE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_TIE.nextNode()
                    );

                }
                stream_TIE.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notes_group"


    public static class notes_variable_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes_variable"
    // src/parser/Music.g:221:1: notes_variable : notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ) ;
    public final MusicParser.notes_variable_return notes_variable() throws RecognitionException {
        MusicParser.notes_variable_return retval = new MusicParser.notes_variable_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal247=null;
        Token FIGURE248=null;
        Token DOT249=null;
        MusicParser.notes_type_return notes_type246 =null;


        AmlTree char_literal247_tree=null;
        AmlTree FIGURE248_tree=null;
        AmlTree DOT249_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:221:17: ( notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ) )
            // src/parser/Music.g:221:21: notes_type ( '.' FIGURE ( DOT )? )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_variable2922);
            notes_type246=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type246.getTree());

            // src/parser/Music.g:221:32: ( '.' FIGURE ( DOT )? )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==92) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // src/parser/Music.g:221:33: '.' FIGURE ( DOT )?
                    {
                    char_literal247=(Token)match(input,92,FOLLOW_92_in_notes_variable2925);  
                    stream_92.add(char_literal247);


                    FIGURE248=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_variable2927);  
                    stream_FIGURE.add(FIGURE248);


                    // src/parser/Music.g:221:44: ( DOT )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==DOT) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // src/parser/Music.g:221:44: DOT
                            {
                            DOT249=(Token)match(input,DOT,FOLLOW_DOT_in_notes_variable2929);  
                            stream_DOT.add(DOT249);


                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: DOT, notes_type, FIGURE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 221:51: -> ^( NOTES notes_type ( FIGURE )? ( DOT )? )
            {
                // src/parser/Music.g:221:54: ^( NOTES notes_type ( FIGURE )? ( DOT )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTES, "NOTES")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:221:73: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:221:81: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notes_variable"


    public static class notes_type_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes_type"
    // src/parser/Music.g:224:1: notes_type : ( chord | notes | drums );
    public final MusicParser.notes_type_return notes_type() throws RecognitionException {
        MusicParser.notes_type_return retval = new MusicParser.notes_type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord250 =null;

        MusicParser.notes_return notes251 =null;

        MusicParser.drums_return drums252 =null;



        try {
            // src/parser/Music.g:224:13: ( chord | notes | drums )
            int alt52=3;
            switch ( input.LA(1) ) {
            case CHORD:
                {
                alt52=1;
                }
                break;
            case ARMOR:
            case BEMOL:
            case NOTE:
            case SUSTAIN:
            case 89:
                {
                alt52=2;
                }
                break;
            case DRUMS:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // src/parser/Music.g:224:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type2972);
                    chord250=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord250.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:224:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type2976);
                    notes251=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes251.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:224:31: drums
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_drums_in_notes_type2980);
                    drums252=drums();

                    state._fsp--;

                    adaptor.addChild(root_0, drums252.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notes_type"


    public static class chord_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chord"
    // src/parser/Music.g:227:1: chord : CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD253=null;
        Token char_literal254=null;
        Token set256=null;
        Token set257=null;
        Token char_literal258=null;
        MusicParser.note_return note255 =null;


        AmlTree CHORD253_tree=null;
        AmlTree char_literal254_tree=null;
        AmlTree set256_tree=null;
        AmlTree set257_tree=null;
        AmlTree char_literal258_tree=null;

        try {
            // src/parser/Music.g:227:13: ( CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:227:17: CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD253=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord3009); 
            CHORD253_tree = 
            (AmlTree)adaptor.create(CHORD253)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD253_tree, root_0);


            char_literal254=(Token)match(input,89,FOLLOW_89_in_chord3012); 

            pushFollow(FOLLOW_note_in_chord3015);
            note255=note();

            state._fsp--;

            adaptor.addChild(root_0, note255.getTree());

            // src/parser/Music.g:227:34: ( MINOR | PLUS | DIMINUTION )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==DIMINUTION||LA53_0==MINOR||LA53_0==PLUS) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set256=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set256)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            // src/parser/Music.g:227:59: ( SEVENTH | MAJ7 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==MAJ7||LA54_0==SEVENTH) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set257=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set257)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            char_literal258=(Token)match(input,90,FOLLOW_90_in_chord3035); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "chord"


    public static class notes_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes"
    // src/parser/Music.g:230:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTE_LIST ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal259=null;
        Token char_literal261=null;
        MusicParser.note_return note260 =null;

        MusicParser.note_return note262 =null;


        AmlTree char_literal259_tree=null;
        AmlTree char_literal261_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:230:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTE_LIST ( note )+ ) )
            // src/parser/Music.g:230:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:230:17: ( '(' ( note )+ ')' | note )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==89) ) {
                alt56=1;
            }
            else if ( (LA56_0==ARMOR||LA56_0==BEMOL||LA56_0==NOTE||LA56_0==SUSTAIN) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // src/parser/Music.g:230:19: '(' ( note )+ ')'
                    {
                    char_literal259=(Token)match(input,89,FOLLOW_89_in_notes3067);  
                    stream_89.add(char_literal259);


                    // src/parser/Music.g:230:23: ( note )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==ARMOR||LA55_0==BEMOL||LA55_0==NOTE||LA55_0==SUSTAIN) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // src/parser/Music.g:230:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes3070);
                    	    note260=note();

                    	    state._fsp--;

                    	    stream_note.add(note260.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt55 >= 1 ) break loop55;
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
                    } while (true);


                    char_literal261=(Token)match(input,90,FOLLOW_90_in_notes3074);  
                    stream_90.add(char_literal261);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:230:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes3079);
                    note262=note();

                    state._fsp--;

                    stream_note.add(note262.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: note
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 230:44: -> ^( NOTE_LIST ( note )+ )
            {
                // src/parser/Music.g:230:47: ^( NOTE_LIST ( note )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                if ( !(stream_note.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_note.hasNext() ) {
                    adaptor.addChild(root_1, stream_note.nextTree());

                }
                stream_note.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notes"


    public static class drums_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drums"
    // src/parser/Music.g:233:1: drums : DRUMS ^ '(' ! num_expr ')' !;
    public final MusicParser.drums_return drums() throws RecognitionException {
        MusicParser.drums_return retval = new MusicParser.drums_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DRUMS263=null;
        Token char_literal264=null;
        Token char_literal266=null;
        MusicParser.num_expr_return num_expr265 =null;


        AmlTree DRUMS263_tree=null;
        AmlTree char_literal264_tree=null;
        AmlTree char_literal266_tree=null;

        try {
            // src/parser/Music.g:233:13: ( DRUMS ^ '(' ! num_expr ')' !)
            // src/parser/Music.g:233:17: DRUMS ^ '(' ! num_expr ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            DRUMS263=(Token)match(input,DRUMS,FOLLOW_DRUMS_in_drums3118); 
            DRUMS263_tree = 
            (AmlTree)adaptor.create(DRUMS263)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(DRUMS263_tree, root_0);


            char_literal264=(Token)match(input,89,FOLLOW_89_in_drums3121); 

            pushFollow(FOLLOW_num_expr_in_drums3124);
            num_expr265=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr265.getTree());

            char_literal266=(Token)match(input,90,FOLLOW_90_in_drums3126); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drums"


    public static class note_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "note"
    // src/parser/Music.g:236:1: note : ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NUM )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set267=null;
        Token NOTE268=null;
        Token NUM269=null;

        AmlTree set267_tree=null;
        AmlTree NOTE268_tree=null;
        AmlTree NUM269_tree=null;

        try {
            // src/parser/Music.g:236:13: ( ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NUM )? )
            // src/parser/Music.g:236:17: ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:236:17: ( BEMOL | SUSTAIN | ARMOR )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==ARMOR||LA57_0==BEMOL||LA57_0==SUSTAIN) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set267=(Token)input.LT(1);

                    if ( input.LA(1)==ARMOR||input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set267)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            NOTE268=(Token)match(input,NOTE,FOLLOW_NOTE_in_note3170); 
            NOTE268_tree = 
            (AmlTree)adaptor.create(NOTE268)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE268_tree, root_0);


            // src/parser/Music.g:236:50: ( NUM )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==NUM) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==LETTER_X) ) {
                    int LA58_3 = input.LA(3);

                    if ( (LA58_3==ASSIG||LA58_3==DECR||LA58_3==DIVIDE_ASSIG||LA58_3==INCR||LA58_3==MINUS_ASSIG||LA58_3==MOD_ASSIG||LA58_3==PLUS_ASSIG||LA58_3==PROD_ASSIG||LA58_3==89||LA58_3==92) ) {
                        alt58=1;
                    }
                }
                else if ( (LA58_1==ARMOR||(LA58_1 >= BAR && LA58_1 <= BOOL)||LA58_1==CHORD||(LA58_1 >= DECR && LA58_1 <= DIMINUTION)||(LA58_1 >= DOUBLE_BAR && LA58_1 <= DRUMS_NOTE_TYPE)||LA58_1==END_REPETITION||LA58_1==FOR||(LA58_1 >= ID && LA58_1 <= INT)||(LA58_1 >= MAJ7 && LA58_1 <= MINOR)||LA58_1==NOTE||LA58_1==NOTE_TYPE||LA58_1==NUM||LA58_1==PLUS||(LA58_1 >= SEVENTH && LA58_1 <= START_REPETITION)||(LA58_1 >= STRING_TYPE && LA58_1 <= TONE)||LA58_1==WHILE||(LA58_1 >= 89 && LA58_1 <= 92)||LA58_1==94||LA58_1==96) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // src/parser/Music.g:236:51: NUM
                    {
                    NUM269=(Token)match(input,NUM,FOLLOW_NUM_in_note3174); 
                    NUM269_tree = 
                    (AmlTree)adaptor.create(NUM269)
                    ;
                    adaptor.addChild(root_0, NUM269_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "note"


    public static class expr_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // src/parser/Music.g:240:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR271=null;
        MusicParser.boolterm_return boolterm270 =null;

        MusicParser.boolterm_return boolterm272 =null;


        AmlTree OR271_tree=null;

        try {
            // src/parser/Music.g:240:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:240:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr3203);
            boolterm270=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm270.getTree());

            // src/parser/Music.g:240:22: ( OR ^ boolterm )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==OR) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // src/parser/Music.g:240:23: OR ^ boolterm
            	    {
            	    OR271=(Token)match(input,OR,FOLLOW_OR_in_expr3206); 
            	    OR271_tree = 
            	    (AmlTree)adaptor.create(OR271)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR271_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr3209);
            	    boolterm272=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm272.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // src/parser/Music.g:243:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND274=null;
        MusicParser.boolfact_return boolfact273 =null;

        MusicParser.boolfact_return boolfact275 =null;


        AmlTree AND274_tree=null;

        try {
            // src/parser/Music.g:243:13: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:243:17: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm3227);
            boolfact273=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact273.getTree());

            // src/parser/Music.g:243:26: ( AND ^ boolfact )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==AND) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // src/parser/Music.g:243:27: AND ^ boolfact
            	    {
            	    AND274=(Token)match(input,AND,FOLLOW_AND_in_boolterm3230); 
            	    AND274_tree = 
            	    (AmlTree)adaptor.create(AND274)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND274_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm3233);
            	    boolfact275=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact275.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // src/parser/Music.g:246:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL277=null;
        Token NOT_EQUAL278=null;
        Token LT279=null;
        Token LE280=null;
        Token GT281=null;
        Token GE282=null;
        MusicParser.num_expr_return num_expr276 =null;

        MusicParser.num_expr_return num_expr283 =null;


        AmlTree EQUAL277_tree=null;
        AmlTree NOT_EQUAL278_tree=null;
        AmlTree LT279_tree=null;
        AmlTree LE280_tree=null;
        AmlTree GT281_tree=null;
        AmlTree GE282_tree=null;

        try {
            // src/parser/Music.g:246:13: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:246:17: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact3255);
            num_expr276=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr276.getTree());

            // src/parser/Music.g:246:26: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==EQUAL||(LA62_0 >= GE && LA62_0 <= GT)||LA62_0==LE||LA62_0==LT||LA62_0==NOT_EQUAL) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // src/parser/Music.g:246:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:246:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt61=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt61=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt61=2;
                        }
                        break;
                    case LT:
                        {
                        alt61=3;
                        }
                        break;
                    case LE:
                        {
                        alt61=4;
                        }
                        break;
                    case GT:
                        {
                        alt61=5;
                        }
                        break;
                    case GE:
                        {
                        alt61=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;

                    }

                    switch (alt61) {
                        case 1 :
                            // src/parser/Music.g:246:28: EQUAL ^
                            {
                            EQUAL277=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact3259); 
                            EQUAL277_tree = 
                            (AmlTree)adaptor.create(EQUAL277)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL277_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:246:37: NOT_EQUAL ^
                            {
                            NOT_EQUAL278=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact3264); 
                            NOT_EQUAL278_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL278)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL278_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:246:50: LT ^
                            {
                            LT279=(Token)match(input,LT,FOLLOW_LT_in_boolfact3269); 
                            LT279_tree = 
                            (AmlTree)adaptor.create(LT279)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT279_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:246:56: LE ^
                            {
                            LE280=(Token)match(input,LE,FOLLOW_LE_in_boolfact3274); 
                            LE280_tree = 
                            (AmlTree)adaptor.create(LE280)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE280_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:246:62: GT ^
                            {
                            GT281=(Token)match(input,GT,FOLLOW_GT_in_boolfact3279); 
                            GT281_tree = 
                            (AmlTree)adaptor.create(GT281)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT281_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:246:68: GE ^
                            {
                            GE282=(Token)match(input,GE,FOLLOW_GE_in_boolfact3284); 
                            GE282_tree = 
                            (AmlTree)adaptor.create(GE282)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE282_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact3288);
                    num_expr283=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr283.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // src/parser/Music.g:249:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS285=null;
        Token MINUS286=null;
        MusicParser.term_return term284 =null;

        MusicParser.term_return term287 =null;


        AmlTree PLUS285_tree=null;
        AmlTree MINUS286_tree=null;

        try {
            // src/parser/Music.g:249:13: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:249:17: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr3310);
            term284=term();

            state._fsp--;

            adaptor.addChild(root_0, term284.getTree());

            // src/parser/Music.g:249:22: ( ( PLUS ^| MINUS ^) term )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==MINUS||LA64_0==PLUS) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // src/parser/Music.g:249:24: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:249:24: ( PLUS ^| MINUS ^)
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==PLUS) ) {
            	        alt63=1;
            	    }
            	    else if ( (LA63_0==MINUS) ) {
            	        alt63=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 63, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // src/parser/Music.g:249:25: PLUS ^
            	            {
            	            PLUS285=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr3315); 
            	            PLUS285_tree = 
            	            (AmlTree)adaptor.create(PLUS285)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS285_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:249:33: MINUS ^
            	            {
            	            MINUS286=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr3320); 
            	            MINUS286_tree = 
            	            (AmlTree)adaptor.create(MINUS286)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS286_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr3324);
            	    term287=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term287.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // src/parser/Music.g:252:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT289=null;
        Token DIV290=null;
        Token MOD291=null;
        MusicParser.factor_return factor288 =null;

        MusicParser.factor_return factor292 =null;


        AmlTree DOT289_tree=null;
        AmlTree DIV290_tree=null;
        AmlTree MOD291_tree=null;

        try {
            // src/parser/Music.g:252:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:252:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term3346);
            factor288=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor288.getTree());

            // src/parser/Music.g:252:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==DIV||LA66_0==DOT||LA66_0==MOD) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // src/parser/Music.g:252:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:252:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt65=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt65=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt65=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt65=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 65, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt65) {
            	        case 1 :
            	            // src/parser/Music.g:252:23: DOT ^
            	            {
            	            DOT289=(Token)match(input,DOT,FOLLOW_DOT_in_term3351); 
            	            DOT289_tree = 
            	            (AmlTree)adaptor.create(DOT289)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT289_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:252:30: DIV ^
            	            {
            	            DIV290=(Token)match(input,DIV,FOLLOW_DIV_in_term3356); 
            	            DIV290_tree = 
            	            (AmlTree)adaptor.create(DIV290)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV290_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:252:37: MOD ^
            	            {
            	            MOD291=(Token)match(input,MOD,FOLLOW_MOD_in_term3361); 
            	            MOD291_tree = 
            	            (AmlTree)adaptor.create(MOD291)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD291_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term3365);
            	    factor292=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor292.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // src/parser/Music.g:255:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT293=null;
        Token PLUS294=null;
        Token MINUS295=null;
        MusicParser.atom_return atom296 =null;


        AmlTree NOT293_tree=null;
        AmlTree PLUS294_tree=null;
        AmlTree MINUS295_tree=null;

        try {
            // src/parser/Music.g:255:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:255:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:255:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt67=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt67=1;
                    }
                    break;
                case PLUS:
                    {
                    alt67=2;
                    }
                    break;
                case MINUS:
                    {
                    alt67=3;
                    }
                    break;
            }

            switch (alt67) {
                case 1 :
                    // src/parser/Music.g:255:14: NOT ^
                    {
                    NOT293=(Token)match(input,NOT,FOLLOW_NOT_in_factor3382); 
                    NOT293_tree = 
                    (AmlTree)adaptor.create(NOT293)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT293_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:255:21: PLUS ^
                    {
                    PLUS294=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor3387); 
                    PLUS294_tree = 
                    (AmlTree)adaptor.create(PLUS294)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS294_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:255:29: MINUS ^
                    {
                    MINUS295=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor3392); 
                    MINUS295_tree = 
                    (AmlTree)adaptor.create(MINUS295)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS295_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor3397);
            atom296=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom296.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // src/parser/Music.g:258:1: atom : ( var_access | NUM | STRING | funcall | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token b=null;
        Token NUM298=null;
        Token STRING299=null;
        Token char_literal301=null;
        Token char_literal303=null;
        MusicParser.var_access_return var_access297 =null;

        MusicParser.funcall_return funcall300 =null;

        MusicParser.expr_return expr302 =null;


        AmlTree b_tree=null;
        AmlTree NUM298_tree=null;
        AmlTree STRING299_tree=null;
        AmlTree char_literal301_tree=null;
        AmlTree char_literal303_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // src/parser/Music.g:258:9: ( var_access | NUM | STRING | funcall | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt69=6;
            switch ( input.LA(1) ) {
            case ID:
            case LETTER_X:
                {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==AND||LA69_1==DIV||LA69_1==DOT||LA69_1==EQUAL||(LA69_1 >= GE && LA69_1 <= GT)||LA69_1==LE||LA69_1==LT||LA69_1==MINUS||LA69_1==MOD||LA69_1==NOT_EQUAL||(LA69_1 >= OR && LA69_1 <= PLUS)||(LA69_1 >= 90 && LA69_1 <= 92)||LA69_1==94) ) {
                    alt69=1;
                }
                else if ( (LA69_1==89) ) {
                    alt69=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;

                }
                }
                break;
            case NUM:
                {
                alt69=2;
                }
                break;
            case STRING:
                {
                alt69=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt69=5;
                }
                break;
            case 89:
                {
                alt69=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }

            switch (alt69) {
                case 1 :
                    // src/parser/Music.g:258:13: var_access
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_atom3413);
                    var_access297=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access297.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:259:7: NUM
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    NUM298=(Token)match(input,NUM,FOLLOW_NUM_in_atom3421); 
                    NUM298_tree = 
                    (AmlTree)adaptor.create(NUM298)
                    ;
                    adaptor.addChild(root_0, NUM298_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:260:7: STRING
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    STRING299=(Token)match(input,STRING,FOLLOW_STRING_in_atom3429); 
                    STRING299_tree = 
                    (AmlTree)adaptor.create(STRING299)
                    ;
                    adaptor.addChild(root_0, STRING299_tree);


                    }
                    break;
                case 4 :
                    // src/parser/Music.g:261:7: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom3437);
                    funcall300=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall300.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:262:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:262:7: (b= TRUE |b= FALSE )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==TRUE) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==FALSE) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;

                    }
                    switch (alt68) {
                        case 1 :
                            // src/parser/Music.g:262:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom3448);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:262:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom3454);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AmlTree)adaptor.nil();
                    // 262:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // src/parser/Music.g:262:30: ^( BOOLEAN[$b,$b.text] )
                        {
                        AmlTree root_1 = (AmlTree)adaptor.nil();
                        root_1 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:263:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal301=(Token)match(input,89,FOLLOW_89_in_atom3471); 

                    pushFollow(FOLLOW_expr_in_atom3474);
                    expr302=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr302.getTree());

                    char_literal303=(Token)match(input,90,FOLLOW_90_in_atom3476); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_global_stmt_in_prog186 = new BitSet(new long[]{0x4000080401002800L,0x0000000000404400L});
    public static final BitSet FOLLOW_EOF_in_prog190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_global_stmt222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frag_in_global_stmt240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_global_stmt258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_funcall283 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_var_funcall285 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_id_rule_in_var_funcall289 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_var_funcall291 = new BitSet(new long[]{0x0C40208080802420L,0x000000000610A005L});
    public static final BitSet FOLLOW_params_in_var_funcall293 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_var_funcall296 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_var_funcall298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access339 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_var_access342 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_id_rule_in_var_access346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_void_in_function445 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_id_rule_in_function449 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_function451 = new BitSet(new long[]{0x4000080001002800L,0x0000000004004000L});
    public static final BitSet FOLLOW_list_arguments_in_function453 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_function455 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_function457 = new BitSet(new long[]{0x40002F8201422A00L,0x0000000000825D01L});
    public static final BitSet FOLLOW_listInst_in_function459 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_function461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_funcall508 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_funcall510 = new BitSet(new long[]{0x0C40208080802420L,0x000000000610A005L});
    public static final BitSet FOLLOW_params_in_funcall512 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_funcall515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAGMENT_in_frag549 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_id_rule_in_frag552 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_frag554 = new BitSet(new long[]{0x4000080001002800L,0x0000000004004000L});
    public static final BitSet FOLLOW_list_arguments_in_frag557 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_frag559 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_frag562 = new BitSet(new long[]{0x48002F8201822E20L,0x000000000282CC00L});
    public static final BitSet FOLLOW_list_music_inst_in_frag565 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_frag567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_list_arguments587 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_list_arguments590 = new BitSet(new long[]{0x4000080001002800L,0x0000000000004000L});
    public static final BitSet FOLLOW_argument_in_list_arguments592 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_type_in_argument633 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_id_rule_in_argument636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params663 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_notes_variable_in_params667 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_params671 = new BitSet(new long[]{0x0C40208080802420L,0x000000000210A005L});
    public static final BitSet FOLLOW_expr_in_params675 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_notes_variable_in_params679 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_inst_in_listInst707 = new BitSet(new long[]{0x40002F8201422A02L,0x0000000000825D01L});
    public static final BitSet FOLLOW_music_inst_in_list_music_inst741 = new BitSet(new long[]{0x48002F8201822E22L,0x000000000282CC00L});
    public static final BitSet FOLLOW_declaration_in_inst785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_inst803 = new BitSet(new long[]{0x0C40208080802420L,0x000000000210A005L});
    public static final BitSet FOLLOW_expr_in_inst807 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_notes_group_in_inst811 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_inst814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_inst833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_inst851 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_inst853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_inst872 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_inst874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_inst893 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_inst895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_inst914 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_inst916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_inst971 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_inst973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_inst1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_music_inst1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_music_inst1088 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_music_inst1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_music_inst1109 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_music_inst1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_music_inst1130 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_music_inst1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_music_inst1151 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_music_inst1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_music_inst1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_music_inst1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_music_stmt_in_music_inst1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_music_inst1226 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_music_inst1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_music_stmt_in_music_inst1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_music_stmt_in_music_inst1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_music_inst1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_group_in_music_inst1310 = new BitSet(new long[]{0x0800000000802422L,0x0000000042008000L});
    public static final BitSet FOLLOW_94_in_music_inst1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration1339 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1342 = new BitSet(new long[]{0x0000000000000000L,0x0000000048000000L});
    public static final BitSet FOLLOW_91_in_declaration1345 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000048000000L});
    public static final BitSet FOLLOW_94_in_declaration1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_type_void1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_void1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_assig_opt1541 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ASSIG_in_assig_opt1544 = new BitSet(new long[]{0x0C40208080802420L,0x000000000210A005L});
    public static final BitSet FOLLOW_expr_in_assig_opt1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig_opt1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_assignation1578 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_assignation1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_assig1610 = new BitSet(new long[]{0x0280000000100040L,0x0000000000000048L});
    public static final BitSet FOLLOW_set_in_assig1612 = new BitSet(new long[]{0x0C40208180802420L,0x000000000210A005L});
    public static final BitSet FOLLOW_expr_in_assig1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGURE_in_assig1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_assig1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pre_in_assig1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_post1703 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_INCR_in_post1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_post1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_pre1761 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_DECR_in_pre1767 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_var_access_in_pre1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat1813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NUM_in_beat1816 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_beat1818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NUM_in_beat1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed1850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NUM_in_speed1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSPORT_in_transport1878 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_expr_in_transport1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUMENT_in_instrument1905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_instrument1908 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_instrument1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1934 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_while_stmt1937 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_expr_in_while_stmt1940 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_while_stmt1942 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_while_stmt1945 = new BitSet(new long[]{0x40002F8201422A00L,0x0000000000825D01L});
    public static final BitSet FOLLOW_listInst_in_while_stmt1948 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_while_stmt1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_music_stmt1977 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_while_music_stmt1980 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_expr_in_while_music_stmt1983 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_while_music_stmt1985 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_while_music_stmt1988 = new BitSet(new long[]{0x48002F8201822E20L,0x000000000282CC00L});
    public static final BitSet FOLLOW_list_music_inst_in_while_music_stmt1991 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_while_music_stmt1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt2028 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_for_stmt2031 = new BitSet(new long[]{0x40002A8001022800L,0x0000000000004000L});
    public static final BitSet FOLLOW_declaration_in_for_stmt2035 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt2039 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_for_stmt2041 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_expr_in_for_stmt2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_for_stmt2047 = new BitSet(new long[]{0x0000228000020000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt2050 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_for_stmt2052 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_for_stmt2055 = new BitSet(new long[]{0x40002F8201422A00L,0x0000000000825D01L});
    public static final BitSet FOLLOW_listInst_in_for_stmt2058 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_for_stmt2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_music_stmt2085 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_for_music_stmt2088 = new BitSet(new long[]{0x40002A8001022800L,0x0000000000004000L});
    public static final BitSet FOLLOW_declaration_in_for_music_stmt2092 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt2096 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_for_music_stmt2098 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_expr_in_for_music_stmt2102 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_for_music_stmt2104 = new BitSet(new long[]{0x0000228000020000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt2107 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_for_music_stmt2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_for_music_stmt2112 = new BitSet(new long[]{0x48002F8201822E20L,0x000000000282CC00L});
    public static final BitSet FOLLOW_list_music_inst_in_for_music_stmt2115 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_for_music_stmt2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_list_assig2146 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_list_assig2149 = new BitSet(new long[]{0x0000228000020000L});
    public static final BitSet FOLLOW_assig_in_list_assig2151 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_IF_in_if_stmt2189 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_if_stmt2192 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_expr_in_if_stmt2195 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_if_stmt2197 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_if_stmt2200 = new BitSet(new long[]{0x40002F8201422A00L,0x0000000000825D01L});
    public static final BitSet FOLLOW_listInst_in_if_stmt2203 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_if_stmt2205 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_elseif_stmt_in_if_stmt2208 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_else_stmt_in_if_stmt2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_stmt2235 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IF_in_elseif_stmt2237 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_elseif_stmt2239 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt2241 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_elseif_stmt2243 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_elseif_stmt2245 = new BitSet(new long[]{0x40002F8201422A00L,0x0000000000825D01L});
    public static final BitSet FOLLOW_listInst_in_elseif_stmt2247 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_elseif_stmt2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt2284 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_else_stmt2287 = new BitSet(new long[]{0x40002F8201422A00L,0x0000000000825D01L});
    public static final BitSet FOLLOW_listInst_in_else_stmt2290 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_else_stmt2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_music_stmt2318 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_if_music_stmt2321 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_expr_in_if_music_stmt2324 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_if_music_stmt2326 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_if_music_stmt2329 = new BitSet(new long[]{0x48002F8201822E20L,0x000000000282CC00L});
    public static final BitSet FOLLOW_list_music_inst_in_if_music_stmt2332 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_if_music_stmt2334 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_elseif_music_stmt_in_if_music_stmt2337 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_else_music_stmt_in_if_music_stmt2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_music_stmt2370 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IF_in_elseif_music_stmt2372 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_elseif_music_stmt2374 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_expr_in_elseif_music_stmt2376 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_elseif_music_stmt2378 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_elseif_music_stmt2380 = new BitSet(new long[]{0x48002F8201822E20L,0x000000000282CC00L});
    public static final BitSet FOLLOW_list_music_inst_in_elseif_music_stmt2382 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_elseif_music_stmt2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_music_stmt2425 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_else_music_stmt2428 = new BitSet(new long[]{0x48002F8201822E20L,0x000000000282CC00L});
    public static final BitSet FOLLOW_list_music_inst_in_else_music_stmt2431 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_else_music_stmt2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song2468 = new BitSet(new long[]{0x0000208000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_id_rule_in_song2471 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_song2474 = new BitSet(new long[]{0x0000000000000200L,0x00000000000E0800L});
    public static final BitSet FOLLOW_beat_in_song2478 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_song2480 = new BitSet(new long[]{0x0000000000000000L,0x00000000000E0800L});
    public static final BitSet FOLLOW_speed_in_song2486 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_song2488 = new BitSet(new long[]{0x0000000000000000L,0x00000000000E0000L});
    public static final BitSet FOLLOW_tone_in_song2494 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_song2496 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_transport_in_song2502 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_song2504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_track_in_song2511 = new BitSet(new long[]{0x0000000000800000L,0x0000000100040000L});
    public static final BitSet FOLLOW_drums_track_in_song2515 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_song2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track2548 = new BitSet(new long[]{0x0000208000400000L,0x0000000000003001L});
    public static final BitSet FOLLOW_id_rule_in_track2551 = new BitSet(new long[]{0x0000000000400000L,0x0000000000003001L});
    public static final BitSet FOLLOW_STRING_in_track2554 = new BitSet(new long[]{0x0000000000400000L,0x0000000000001001L});
    public static final BitSet FOLLOW_compas_aux_in_track2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRUMS_in_drums_track2592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_TRACK_in_drums_track2595 = new BitSet(new long[]{0x0000000000400000L,0x0000000000001001L});
    public static final BitSet FOLLOW_compas_aux_in_drums_track2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2651 = new BitSet(new long[]{0x48002F8201C22E20L,0x000000000282DC01L});
    public static final BitSet FOLLOW_repetition_in_compas_list2656 = new BitSet(new long[]{0x48002F8201C22E20L,0x000000000282DC01L});
    public static final BitSet FOLLOW_compasses_in_compas_list2660 = new BitSet(new long[]{0x48002F8201C22E20L,0x000000000282DC01L});
    public static final BitSet FOLLOW_repetition_in_compas_list2664 = new BitSet(new long[]{0x48002F8201C22E20L,0x000000000282DC01L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses2696 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_BAR_in_compasses2699 = new BitSet(new long[]{0x48002F8201822E20L,0x000000000282CC00L});
    public static final BitSet FOLLOW_compas_in_compasses2702 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NUM_in_repetition2729 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LETTER_X_in_repetition2731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition2735 = new BitSet(new long[]{0x48002F8201822E20L,0x000000000282CC00L});
    public static final BitSet FOLLOW_compasses_in_repetition2737 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_music_inst_in_compas2790 = new BitSet(new long[]{0x48002F8201822E22L,0x000000000282CC00L});
    public static final BitSet FOLLOW_TONE_in_tone2834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NUM_in_tone2837 = new BitSet(new long[]{0x0000000000000400L,0x0000000000008000L});
    public static final BitSet FOLLOW_set_in_tone2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group2868 = new BitSet(new long[]{0x0000000000000002L,0x0000000010010000L});
    public static final BitSet FOLLOW_92_in_notes_group2871 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_group2873 = new BitSet(new long[]{0x0000000000200002L,0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_notes_group2875 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_TIE_in_notes_group2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_variable2922 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_notes_variable2925 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_variable2927 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_DOT_in_notes_variable2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drums_in_notes_type2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord3009 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_chord3012 = new BitSet(new long[]{0x0800000000000420L,0x0000000000008000L});
    public static final BitSet FOLLOW_note_in_chord3015 = new BitSet(new long[]{0x0030000000040000L,0x0000000004000204L});
    public static final BitSet FOLLOW_90_in_chord3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_notes3067 = new BitSet(new long[]{0x0800000000000420L,0x0000000000008000L});
    public static final BitSet FOLLOW_note_in_notes3070 = new BitSet(new long[]{0x0800000000000420L,0x0000000004008000L});
    public static final BitSet FOLLOW_90_in_notes3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRUMS_in_drums3118 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_drums3121 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_num_expr_in_drums3124 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_drums3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note3170 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_NUM_in_note3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr3203 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_expr3206 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_boolterm_in_expr3209 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm3227 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm3230 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_boolfact_in_boolterm3233 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact3255 = new BitSet(new long[]{0x8008106020000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact3259 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact3264 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_LT_in_boolfact3269 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_LE_in_boolfact3274 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_GT_in_boolfact3279 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_GE_in_boolfact3284 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_num_expr_in_boolfact3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr3310 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_num_expr3315 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_MINUS_in_num_expr3320 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_term_in_num_expr3324 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_term3346 = new BitSet(new long[]{0x0100000000280002L});
    public static final BitSet FOLLOW_DOT_in_term3351 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_DIV_in_term3356 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_MOD_in_term3361 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_factor_in_term3365 = new BitSet(new long[]{0x0100000000280002L});
    public static final BitSet FOLLOW_NOT_in_factor3382 = new BitSet(new long[]{0x0000208080000000L,0x0000000002102001L});
    public static final BitSet FOLLOW_PLUS_in_factor3387 = new BitSet(new long[]{0x0000208080000000L,0x0000000002102001L});
    public static final BitSet FOLLOW_MINUS_in_factor3392 = new BitSet(new long[]{0x0000208080000000L,0x0000000002102001L});
    public static final BitSet FOLLOW_atom_in_factor3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_atom3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_atom3471 = new BitSet(new long[]{0x0440208080000000L,0x0000000002102005L});
    public static final BitSet FOLLOW_expr_in_atom3474 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_atom3476 = new BitSet(new long[]{0x0000000000000002L});

}