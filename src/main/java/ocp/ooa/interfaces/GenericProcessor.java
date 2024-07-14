package ocp.ooa.interfaces;

import java.util.Collection;

/**
 * @author suleyman.yildirim
 */
interface Processor {
	Iterable process();
}

interface ItemProcessor extends Processor{
	Collection process();
}

interface WordProcessor extends Processor{
	//String process(); // String is not a sub type of Iterable, and thus, is not covariant with Iterable
}

interface GenericProcessor extends ItemProcessor, WordProcessor{

}
